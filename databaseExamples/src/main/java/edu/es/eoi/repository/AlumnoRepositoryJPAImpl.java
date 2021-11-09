package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Alumno;

public class AlumnoRepositoryJPAImpl implements AlumnoRepository {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("MYDATABASE_PU");
	EntityManager em=emf.createEntityManager();
	
	@Override
	public Alumno findById(int id) {
		
		return em.find(Alumno.class, id);
		
	}

	@Override
	public void save(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alumno update(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
