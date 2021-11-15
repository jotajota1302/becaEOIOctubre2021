package edu.es.eoi.repository;

import org.springframework.stereotype.Repository;

@Repository("JDBC")
public class AlumnoRepositoryJDBCImpl implements AlumnoRepository{

	@Override
	public void doSomething() {
		
		System.out.println("access data from repository with JDBC");
		
	}

}
