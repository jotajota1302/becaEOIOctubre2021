package edu.es.eoi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String goToHomeGet(@RequestParam String nombre) {
		
		System.out.println("reenvio a index por get");
			
		System.out.println(nombre);
		
		return "index.html";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Persona createPerson() {
			
		List<String> telefonos= new ArrayList<>();
		telefonos.add("453453456");
		telefonos.add("787587458");
		
		return new Persona("Pepito",telefonos);		
	}
	
}
