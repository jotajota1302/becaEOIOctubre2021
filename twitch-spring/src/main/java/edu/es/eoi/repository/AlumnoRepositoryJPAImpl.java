package edu.es.eoi.repository;

import org.springframework.stereotype.Repository;

@Repository("JPA")
public class AlumnoRepositoryJPAImpl implements AlumnoRepository{

	@Override
	public void doSomething() {
		
		System.out.println("access data from repository with JPA");
		
	}

}
