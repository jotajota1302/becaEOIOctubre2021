package edu.es.eoi;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		    .withUser("JJ").password(getEncoder().encode("root")).roles("ADMIN").and()
		    .withUser("PEPE").password(getEncoder().encode("root")).roles("USER");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		    .anyRequest()
		    .authenticated()
		    .and()
		    .httpBasic();
	}

	@Bean
	public PasswordEncoder getEncoder() {
		
		return new BCryptPasswordEncoder();
		
	}
	
	
	
	
	
	
}
