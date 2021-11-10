package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Cuenta;

public class CuentaRepositoryJPAImpl implements MyRepository<Cuenta, Integer> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("BANCO_PU");
	EntityManager em = emf.createEntityManager();

	@Override
	public Cuenta findById(Integer id) {

		return em.find(Cuenta.class, id);
	}

	@Override
	public void remove(Integer id) {

		em.getTransaction().begin();
		
		em.remove(em.find(Cuenta.class, id));

		em.getTransaction().commit();
	}

	@Override
	public Cuenta update(Cuenta e) {

		em.getTransaction().begin();

		em.merge(e);

		em.getTransaction().commit();

		return e;
	}

	@Override
	public void save(Cuenta e) {

		em.getTransaction().begin();

		em.persist(e);

		em.getTransaction().commit();

	}

}
