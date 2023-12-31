package com.cos.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

	@Bean
	public	 BCryptPasswordEncoder encodePWD() {
		String encPassword = new BCryptPasswordEncoder().encode("1234");
		return new BCryptPasswordEncoder();
	}
	
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests(authorizeRequest ->
                    authorizeRequest
                            .requestMatchers(
                                    AntPathRequestMatcher.antMatcher("/**")
                            ).permitAll()
                            .requestMatchers(
                                    AntPathRequestMatcher.antMatcher("/")
                            ).permitAll().anyRequest().authenticated()
            );
		/* http.formLogin().loginPage("/auth/loginForm").permitAll(); */
        return http.build();
    }

}
