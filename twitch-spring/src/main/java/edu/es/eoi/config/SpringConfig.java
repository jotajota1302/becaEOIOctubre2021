package edu.es.eoi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.es.eoi.domain.MyRepository;
import edu.es.eoi.domain.MyService;

@Configuration
public class SpringConfig {
	
	@Bean
	public MyService getService() {
		
		return new MyService(getRepo());
		
	}
		
	@Bean
	public MyRepository getRepo() {
		
		return new MyRepository();
		
	}
	

}
