package edu.es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Subscripcion;

public class SubscripcionRepositoryJPAImpl implements MyRepository<Subscripcion, String> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TWITCH_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Subscripcion findById(String id) {

		return em.find(Subscripcion.class, id);
	}

	@Override
	public void remove(String id) {

		em.getTransaction().begin();
		
		em.remove(em.find(Subscripcion.class, id));

		em.getTransaction().commit();
	}

	@Override
	public Subscripcion update(Subscripcion e) {

		em.getTransaction().begin();

		em.merge(e);

		em.getTransaction().commit();

		return e;
	}

	@Override
	public void save(Subscripcion e) {

		em.getTransaction().begin();

		em.persist(e);

		em.getTransaction().commit();

	}
	
	@SuppressWarnings("unchecked")
	public List<Subscripcion> findAll(){
		
		String hql="from Subscripcion";
		Query query = em.createQuery(hql);
		
		return query.getResultList();
		
	}

}
