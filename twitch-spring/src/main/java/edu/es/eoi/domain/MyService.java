package edu.es.eoi.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired
	MyRepository repo;
	
	public void doSomething() {
		
		System.out.println("do something from service");
		
		repo.getSomething();
		
	};

}
