//package com.madbarsoft.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable()
//		.authorizeRequests()
//		.antMatchers("/home").hasAuthority("ADMIN")
//		.antMatchers("/admin").hasAuthority("ADMIN")
//		.antMatchers("/super-admin").hasAuthority("SUPER_ADMIN")
//		.anyRequest()
//		.authenticated();
//
//	}
//
////	@Bean
////	@Override
////	public AuthenticationManager authenticationManagerBean() throws Exception {
////		return super.authenticationManagerBean();
////	}
//
//	// @Configuration
//	// protected static class AuthenticationManagerConfiguration extends
//	// GlobalAuthenticationConfigurerAdapter {
//	//
//	// @Override
//	// public void init(AuthenticationManagerBuilder auth) throws Exception {
//	// auth.inMemoryAuthentication().withUser("imran").password("12345").roles("USER");
//	// }
//	//
//	// }
//
////	@Autowired
////	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().withUser("user").password("12345").roles("USER").and().withUser("admin")
////				.password("123456").roles("USER", "ADMIN");
////	}
//
//	// @Bean
//	// public BCryptPasswordEncoder passwordEncoder() {
//	// return new BCryptPasswordEncoder();
//	// }
//
//}
