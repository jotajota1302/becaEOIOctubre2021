package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Alumno;

public class AlumnoRepositoryJPAImpl implements MyRepository<Alumno,Integer>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ALUMNO_PU");
	EntityManager em = emf.createEntityManager();

	
	public Alumno findById(Integer id) {

		return em.find(Alumno.class, id);

	}

	
	public void save(Alumno alumno) {

		em.persist(alumno);

	}


	public Alumno update(Alumno alumno) {

		return em.merge(alumno);
	}	


	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
