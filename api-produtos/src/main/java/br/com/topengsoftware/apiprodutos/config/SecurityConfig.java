package br.com.topengsoftware.apiprodutos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static java.util.EnumSet.allOf;
import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasAuthority;
import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasRole;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain web(HttpSecurity http) throws Exception {
        GrantedAuthority authority = new SimpleGrantedAuthority("myAuthority");
        http.authorizeHttpRequests(authorized -> authorized
                        .requestMatchers(HttpMethod.GET, "/produtos").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/produtos/*").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/produtos").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/usuarios").hasRole("ADMIN")
                        .anyRequest().permitAll())
                .httpBasic()
                .and()
                .csrf().disable();

        return http.build();
    }

    @Bean
    public UserDetailsService users() {

        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("123mudar"))
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(admin);
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
