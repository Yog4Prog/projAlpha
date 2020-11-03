package com.proj.alpha.config;

import com.proj.alpha.common.JwtUtil;
import com.proj.alpha.common.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    UserDetailsService userDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String authorizationHeader = request.getHeader("Authorization");

        String userName = null;
        String jwt = null;

        if(authorizationHeader != null && authorizationHeader.startsWith("Bearer "))
        {
            jwt = authorizationHeader.substring(7);
            userName = jwtUtil.extractUserName(jwt);
        }
        if(userName != null && SecurityContextHolder.getContext().getAuthentication() == null)
        {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(userName);
            boolean skippedJwtUrl = isJwtNotRequiredUrl(request);
            if(jwtUtil.validateToken(jwt,userDetails) || skippedJwtUrl)
            {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails,null,userDetails.getAuthorities());
                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }
        filterChain.doFilter(request,response);
    }

    private boolean isJwtNotRequiredUrl(HttpServletRequest req)
    {
        for (String str:SecurityConstants.WHITELIST_URL) {
            if(req.getRequestURI().equals(str))
            {
                return true;
            }
        }
        return false;
    }
}
