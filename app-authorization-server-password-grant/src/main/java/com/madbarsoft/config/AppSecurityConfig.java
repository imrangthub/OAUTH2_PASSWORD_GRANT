//package com.madbarsoft.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
//
//@Configuration
//public class AppSecurityConfig {
//	
//	protected static class AuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter {
//
//		@Override
//		public void init(AuthenticationManagerBuilder auth) throws Exception {
//			auth.inMemoryAuthentication().withUser("javainuse-user").password("javainuse-pass").roles("USER");
//		}
//
//	}
//
//}
