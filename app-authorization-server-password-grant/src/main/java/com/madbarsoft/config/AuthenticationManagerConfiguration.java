package com.madbarsoft.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class AuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter {

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("imran").password("12345").roles("ADMIN");
	}
	
	

}