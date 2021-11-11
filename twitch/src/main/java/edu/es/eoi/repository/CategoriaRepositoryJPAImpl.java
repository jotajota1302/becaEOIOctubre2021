package edu.es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Categoria;

public class CategoriaRepositoryJPAImpl implements MyRepository<Categoria, Integer> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TWITCH_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Categoria findById(Integer id) {

		return em.find(Categoria.class, id);
	}

	@Override
	public void remove(Integer id) {

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
	
	@SuppressWarnings("unchecked")
	public List<Categoria> findAll(){
		
		String hql="from Categoria";
		Query query = em.createQuery(hql);
		
		return query.getResultList();
		
	}

}
