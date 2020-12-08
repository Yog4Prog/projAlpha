package com.proj.alpha.shared.controller;

import com.proj.alpha.common.JwtUtil;
import com.proj.alpha.shared.model.AuthenticationRequest;
import com.proj.alpha.shared.model.AuthenticationResponse;
import com.proj.alpha.storedetails.service.StoreUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    StoreUserDetailsService storeUserDetailsService;
    @Autowired
    JwtUtil jwtUtil;


    @RequestMapping(value="/authenticate", method= RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        System.out.println(authenticationRequest.toString());
        try
        {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(),authenticationRequest.getPassword()));
        }
        catch(BadCredentialsException exception)
        {
            throw new Exception("Incorrect Username or password");
        }

        UserDetails userDetails = storeUserDetailsService.loadUserByUsername(authenticationRequest.getUserName());

        final String jwtToken = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwtToken));
    }
}
