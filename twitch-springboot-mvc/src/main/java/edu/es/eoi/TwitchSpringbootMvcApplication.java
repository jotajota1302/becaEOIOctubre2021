package edu.es.eoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories 
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class TwitchSpringbootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitchSpringbootMvcApplication.class, args);
	}

}
