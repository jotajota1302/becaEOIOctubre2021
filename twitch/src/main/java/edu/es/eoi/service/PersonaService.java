package edu.es.eoi.service;

import edu.es.eoi.entity.Persona;
import edu.es.eoi.repository.PersonaRepositoryJPAImpl;

public class PersonaService {
	
	PersonaRepositoryJPAImpl repo= new PersonaRepositoryJPAImpl();
	
	public Persona getPersona(int id) {
		
		return repo.findById(id);
		
	}

}
