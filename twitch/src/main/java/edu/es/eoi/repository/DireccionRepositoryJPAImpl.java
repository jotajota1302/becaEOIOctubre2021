package edu.es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Direccion;

public class DireccionRepositoryJPAImpl implements MyRepository<Direccion, Integer> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TWITCH_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Direccion findById(Integer id) {

		return em.find(Direccion.class, id);
	}

	@Override
	public void remove(Integer id) {

		em.getTransaction().begin();
		
		em.remove(em.find(Direccion.class, id));

		em.getTransaction().commit();
	}

	@Override
	public Direccion update(Direccion e) {

		em.getTransaction().begin();

		em.merge(e);

		em.getTransaction().commit();

		return e;
	}

	@Override
	public void save(Direccion e) {

		em.getTransaction().begin();

		em.persist(e);

		em.getTransaction().commit();

	}
	
	@SuppressWarnings("unchecked")
	public List<Direccion> findAll(){
		
		String hql="from Direccion";
		Query query = em.createQuery(hql);
		
		return query.getResultList();
		
	}

}
