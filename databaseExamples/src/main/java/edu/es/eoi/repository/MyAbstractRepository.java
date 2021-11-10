package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class MyAbstractRepository<E>{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ALUMNO_PU");
	EntityManager em = emf.createEntityManager();
		
	public void save(E entity) {
		
		em.getTransaction().begin();
		
		em.persist(entity);
		
		em.getTransaction().commit();
		
	}
	
	public void remove(E entity) {
		
		em.getTransaction().begin();
		
		em.remove(entity);
		
		em.getTransaction().commit();
		
	}
	
	
	

}
