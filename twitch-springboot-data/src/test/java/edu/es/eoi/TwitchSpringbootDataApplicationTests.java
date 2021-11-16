package edu.es.eoi;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.entity.Persona;
import edu.es.eoi.repository.PersonaRepository;

@SpringBootTest
class TwitchSpringbootDataApplicationTests {

	@Autowired
	PersonaRepository repo;
	
	@Test
	void testFind() {

		Optional<Persona> p= repo.findById(7);
	
		if(p.isPresent()) {
			Assertions.assertEquals("JJJ",p.get().getNombre());
			Assertions.assertEquals(1,repo.count());
		}	
	
	
	
	}

}
