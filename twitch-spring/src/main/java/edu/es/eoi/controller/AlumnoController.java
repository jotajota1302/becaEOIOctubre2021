package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.es.eoi.service.AlumnoService;

@Controller
public class AlumnoController {

	@Autowired
	AlumnoService service;
	
	public void doSomething() {
		
		System.out.println("validate and call service");
		
		service.doSomething();
	}
	
}
