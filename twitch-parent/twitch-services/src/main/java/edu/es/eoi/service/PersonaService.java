package edu.es.eoi.service;

import edu.es.eoi.entity.Persona;
import edu.es.eoi.repository.PersonaRepositoryJDBCImpl;

public class PersonaService {
	
	public Persona getPersona(int id) {
		
//		PersonaRepositoryJPAImpl repo= new PersonaRepositoryJPAImpl();
		PersonaRepositoryJDBCImpl repo= new PersonaRepositoryJDBCImpl();
		
		return repo.findById(id);
		
	}

}
