package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Banco;

public class BancoRepositoryJPAImpl implements MyRepository<Banco, Integer> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("BANCO_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Banco findById(Integer id) {

		return em.find(Banco.class, id);
	}

	@Override
	public void remove(Integer id) {

		em.getTransaction().begin();
		
		em.remove(em.find(Banco.class, id));

		em.getTransaction().commit();
	}

	@Override
	public Banco update(Banco e) {

		em.getTransaction().begin();

		em.merge(e);

		em.getTransaction().commit();

		return e;
	}

	@Override
	public void save(Banco e) {

		em.getTransaction().begin();

		em.persist(e);

		em.getTransaction().commit();

	}

}
