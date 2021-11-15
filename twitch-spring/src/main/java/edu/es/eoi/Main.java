package edu.es.eoi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.es.eoi.config.SpringConfig;
import edu.es.eoi.domain.MyRepository;
import edu.es.eoi.domain.MyService;

public class Main {
	
	static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	
	public static void main(String[] args) {
								
		MyService service = context.getBean(MyService.class);
		
		service.doSomething();
		
		MyRepository repo=context.getBean(MyRepository.class);
		
		repo.getSomething();		
	
	}

}
