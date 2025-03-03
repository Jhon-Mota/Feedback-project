package com.api.feedback.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration {
    
    @Bean
    public PasswordEncoder encode() {
        return new BCryptPasswordEncoder();
    }

    
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .formLogin(login -> login
                        .loginPage("/index.html")
                        .failureUrl("/index.html"))
                .logout(logout -> logout
                        .logoutSuccessUrl("/index.html"));
}
}
