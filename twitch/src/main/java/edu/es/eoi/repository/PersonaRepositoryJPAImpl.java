package edu.es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Persona;

public class PersonaRepositoryJPAImpl implements MyRepository<Persona, String> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TWITCH_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Persona findById(String id) {

		return em.find(Persona.class, id);
	}

	@Override
	public void remove(String id) {

		em.getTransaction().begin();
		
		em.remove(em.find(Persona.class, id));

		em.getTransaction().commit();
	}

	@Override
	public Persona update(Persona e) {

		em.getTransaction().begin();

		em.merge(e);

		em.getTransaction().commit();

		return e;
	}

	@Override
	public void save(Persona e) {

		em.getTransaction().begin();

		em.persist(e);

		em.getTransaction().commit();

	}
	
	public List<?> findAll(){
		
		String hql="from Persona";
		Query query = em.createQuery(hql);
		
		return query.getResultList();
		
	}

}
