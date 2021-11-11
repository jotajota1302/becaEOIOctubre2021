package edu.es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Categoria;

public class CategoriaRepositoryJPAImpl implements MyRepository<Categoria, String> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TWITCH_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Categoria findById(String id) {

		return em.find(Categoria.class, id);
	}

	@Override
	public void remove(String id) {

		em.getTransaction().begin();
		
		em.remove(em.find(Categoria.class, id));

		em.getTransaction().commit();
	}

	@Override
	public Categoria update(Categoria e) {

		em.getTransaction().begin();

		em.merge(e);

		em.getTransaction().commit();

		return e;
	}

	@Override
	public void save(Categoria e) {

		em.getTransaction().begin();

		em.persist(e);

		em.getTransaction().commit();

	}
	
	public List<?> findAll(){
		
		String hql="from Categoria";
		Query query = em.createQuery(hql);
		
		return query.getResultList();
		
	}

}
