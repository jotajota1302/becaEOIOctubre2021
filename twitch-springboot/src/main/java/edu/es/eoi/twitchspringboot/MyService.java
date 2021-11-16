package edu.es.eoi.twitchspringboot;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public Integer calculate(int a, int b) {		
		
		return a*b+1;
	}
	
}
