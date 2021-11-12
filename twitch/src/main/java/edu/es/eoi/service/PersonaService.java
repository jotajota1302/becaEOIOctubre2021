package edu.es.eoi.service;

import edu.es.eoi.entity.Persona;
import edu.es.eoi.repository.PersonaRepositoryJPAImpl;

public class PersonaService {
	
	public Persona getPersona(int id) {
		
		PersonaRepositoryJPAImpl repo= new PersonaRepositoryJPAImpl();
		
		return repo.findById(id);
		
	}

}
