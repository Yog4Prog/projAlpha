package com.proj.alpha.common;

public class SecurityConstants {
    public static final String SECRET_KEY = "JwtSecretTokenKey";
    public static final long EXPIRATION_TIME = 1000 * 60 * 1440;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING =  "Authorization";

    public static final String[] WHITELIST_URL = {
            "/",
            "/authenticate",
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/swagger-resources/configuration/ui",
            "/swagger-resources/configuration/security",
            "/csrf",
            "/actuator/health"
    };

}
