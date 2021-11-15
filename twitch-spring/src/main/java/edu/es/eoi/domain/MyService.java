package edu.es.eoi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyService {
	
	MyRepository repo;
	
	public MyService(MyRepository repo) {
		
		this.repo=repo;
	}
	
	public void doSomething() {
		
		System.out.println("do something from service");
		
		repo.getSomething();
		
	};

}
