//package com.example.practise1;
//
//import java.util.Arrays;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AuthProvider implements AuthenticationProvider{
//
//	@Override
//	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//		// TODO Auto-generated method stub
//		String userName = authentication.getName();
//		String password = authentication.getCredentials().toString();
//		
//		return new UsernamePasswordAuthenticationToken(userName, password,Arrays.asList(null));
//	}
//
//	@Override
//	public boolean supports(Class<?> authentication) {
//		// TODO Auto-generated method stub
//		return authentication.equals(UsernamePasswordAuthenticationToken.class);
//	}
//
//}
