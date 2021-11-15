package edu.es.eoi.domain;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	
	public void getSomething() {
		
		System.out.println("acces to ddbb");
	}

}
