package com.proj.alpha.common;

import com.mongodb.Function;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtUtil {

 public String extractUserName(String token)
 {
     return extractClaim(token,Claims::getSubject);
 }
 public Date extractExpirationDate(String token)
 {
     return extractClaim(token,Claims::getExpiration);
 }
 public Boolean isTokenExpired(String token)
 {
     return extractExpirationDate(token).before(new Date());
 }
 public Boolean validateToken(String token, UserDetails userDetails)
 {
     final String userName = extractUserName(token);
     return (userDetails.getUsername().equals(userName));
 }
 public <T> T extractClaim(String token, Function<Claims,T> claimsResolver)
 {
     final Claims claims = extractAllClaims(token);
     return claimsResolver.apply(claims);
 }
 private Claims extractAllClaims(String token)
 {
   return  Jwts.parser().setSigningKey(SecurityConstants.SECRET_KEY).parseClaimsJws(token).getBody();
 }

 public String generateToken(UserDetails userDetails)
 {
     Map<String, Object> claims = new HashMap<>();
     return createToken(claims,userDetails.getUsername());
 }
 private String createToken(Map<String, Object> claims, String subject)
 {
     return Jwts.builder()
             .setClaims(claims)
             .setSubject(subject)
             .setIssuedAt(new Date(System.currentTimeMillis()))
             .setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
             .signWith(SignatureAlgorithm.HS256,SecurityConstants.SECRET_KEY)
             .compact();
 }

}
