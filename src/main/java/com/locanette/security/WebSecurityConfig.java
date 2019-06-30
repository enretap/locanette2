package com.locanette.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		    .dataSource(dataSource)
		    .usersByUsernameQuery("select username as principal, password as credentials, active from loc_users where username=?")
		    .authoritiesByUsernameQuery("select username as principal, role as role from loc_users_roles where username=?")
		    .rolePrefix("ROLE_")
		    .passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/login");
		http.authorizeRequests().antMatchers("/admin/order/home").hasRole("USER");
		http.authorizeRequests().antMatchers("/admin","/admin/order/create").hasRole("ADMIN");
		http.exceptionHandling().accessDeniedPage("/403");
	}

}
