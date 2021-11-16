package edu.es.eoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = "edu.es.eoi")
public class TwitchSpringbootDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitchSpringbootDataApplication.class, args);			
	}

}
