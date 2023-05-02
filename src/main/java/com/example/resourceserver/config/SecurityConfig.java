package com.example.resourceserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange(authorize ->
                        authorize
                                .anyExchange()
                                .authenticated()
                )
                .oauth2ResourceServer()
                .jwt();

        return http.build();
    }
}
