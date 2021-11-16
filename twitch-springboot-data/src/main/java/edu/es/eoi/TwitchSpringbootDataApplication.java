package edu.es.eoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TwitchSpringbootDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitchSpringbootDataApplication.class, args);			
	}

}
