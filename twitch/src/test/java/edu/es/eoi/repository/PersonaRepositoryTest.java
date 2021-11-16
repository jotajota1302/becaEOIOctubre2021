package edu.es.eoi.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Persona;
import edu.es.eoi.repository.PersonaRepositoryJPAImpl;

class PersonaRepositoryTest {

	PersonaRepositoryJPAImpl repo= new PersonaRepositoryJPAImpl();
	
	@Test
	void testFindById() {
	
		Persona p= new Persona();
		p.setNombre("TEST");
		
		repo.save(p);
		
		p=repo.findById(p.getId());
		
		Assertions.assertEquals("TEST", p.getNombre());
		
		repo.remove(p.getId());
		
	}
	
}
