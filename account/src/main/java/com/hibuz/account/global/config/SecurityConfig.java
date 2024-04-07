package com.hibuz.account.global.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    @ConditionalOnProperty(name="spring.h2.console.enabled", havingValue="true")
    protected SecurityFilterChain config(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(authorize ->
                authorize.requestMatchers("/h2-console/**", "/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        .anyRequest().authenticated());

        http.headers(headers ->
                headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable));

        http.csrf(CsrfConfigurer::disable);

        return http.build();
    }
}
