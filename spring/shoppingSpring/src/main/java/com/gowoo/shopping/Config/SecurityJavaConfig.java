package com.gowoo.shopping.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.gowoo.shopping.Service.JWTService;
import com.gowoo.shopping.filter.JWTAuthFilter;

@Configuration
@EnableWebSecurity
public class SecurityJavaConfig{
	
	@Autowired
	private JWTService service;
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.addFilterBefore(new JWTAuthFilter(service), UsernamePasswordAuthenticationFilter.class);
        http.formLogin().disable();
        http.httpBasic().disable();
        http.authorizeRequests()
        	.requestMatchers("/auth/**").permitAll()
        	.requestMatchers("/api/**").authenticated()
        	.anyRequest().permitAll();

        return http.build();
    }
}
