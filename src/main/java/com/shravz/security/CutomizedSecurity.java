package com.shravz.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class CutomizedSecurity extends WebSecurityConfigurerAdapter {
/*	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
		http.formLogin();
		http.httpBasic();
} */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/home").permitAll()
		.antMatchers("/balance").authenticated()
		.antMatchers("/statement").authenticated()
		.antMatchers("/loan").authenticated()
		.antMatchers("/contact").permitAll()
		.and().formLogin()
		.and().httpBasic();

}
// in Memory auth code
//Here Give Space logged for different Roles	

}
