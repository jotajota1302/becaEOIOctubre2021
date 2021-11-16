package edu.es.eoi.twitchspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TwitchSpringbootApplicationTests {

	@Autowired
	MyService service;
	
	@Test
	void myServiceTest() {
		
		Assertions.assertEquals(7, service.calculate(2,3));
		
	}

}
