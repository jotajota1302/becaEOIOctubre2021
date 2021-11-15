package edu.es.eoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.es.eoi.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	@Qualifier("JDBC")
	AlumnoRepository repository;
	
	
	@Override
	public void doSomething() {
		
		System.out.println("do logic from service");
		
		repository.doSomething();
		
	}

	
	
}
