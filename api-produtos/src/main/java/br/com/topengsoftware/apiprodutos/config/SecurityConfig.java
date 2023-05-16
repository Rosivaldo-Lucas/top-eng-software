package br.com.topengsoftware.apiprodutos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    @Order(1)
    public SecurityFilterChain defaultSecurityFilterChain(final HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((authorized) -> authorized.anyRequest().permitAll()).csrf().disable();

        return httpSecurity.build();
    }

}
