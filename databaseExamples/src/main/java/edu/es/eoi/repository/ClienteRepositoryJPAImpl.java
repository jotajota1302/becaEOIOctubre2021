package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Cliente;

public class ClienteRepositoryJPAImpl implements MyRepository<Cliente, String> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("BANCO_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Cliente findById(String id) {

		return em.find(Cliente.class, id);
	}

	@Override
	public void remove(String id) {

		em.getTransaction().begin();
		
		em.remove(em.find(Cliente.class, id));

		em.getTransaction().commit();
	}

	@Override
	public Cliente update(Cliente e) {

		em.getTransaction().begin();

		em.merge(e);

		em.getTransaction().commit();

		return e;
	}

	@Override
	public void save(Cliente e) {

		em.getTransaction().begin();

		em.persist(e);

		em.getTransaction().commit();

	}

}
