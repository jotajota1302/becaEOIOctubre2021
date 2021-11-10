package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Alumno;

public class AlumnoRepositoryJPAImpl implements MyRepository<Alumno>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ALUMNO_PU");
	EntityManager em = emf.createEntityManager();

	
	public Alumno findById(int id) {

		return em.find(Alumno.class, id);

	}

	
	public void save(Alumno alumno) {

		em.persist(alumno);

	}


	public Alumno update(Alumno alumno) {

		return em.merge(alumno);
	}

	
	public void remove(int id) {

		em.remove(findById(id));

	}

}
