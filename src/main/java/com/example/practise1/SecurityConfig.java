//package com.example.practise1;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
//	{
//		http.httpBasic(Customizer.withDefaults());
//		http.authorizeHttpRequests(authorize->authorize.anyRequest().authenticated());
//		return http.build();
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
//}
