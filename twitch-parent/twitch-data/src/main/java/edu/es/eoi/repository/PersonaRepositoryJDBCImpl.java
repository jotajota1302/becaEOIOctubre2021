package edu.es.eoi.repository;

import java.util.List;

import edu.es.eoi.entity.Persona;

public class PersonaRepositoryJDBCImpl implements MyRepository<Persona, Integer> {
	@Override

	
	public Persona findById(Integer id) {

		Persona p= new Persona();
		p.setNombre("PERSONA RECUPERADA POR JDBC");
		
		return p;
	}

	@Override
	public void remove(Integer id) {

		
	}

	@Override
	public Persona update(Persona e) {

		return null;
	}

	@Override
	public void save(Persona e) {



	}

	public List<Persona> findAll(){

		
		return null;
		
	}

}
