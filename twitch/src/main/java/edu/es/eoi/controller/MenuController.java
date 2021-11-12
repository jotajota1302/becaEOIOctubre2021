package edu.es.eoi.controller;

import edu.es.eoi.entity.Persona;
import edu.es.eoi.service.PersonaService;
import edu.es.eoi.view.MenuView;
import edu.es.eoi.view.PersonaView;

public class MenuController {
	
	public static void processMenuReturn(int id) {

		if(id==0) {
			System.out.println("Error, no hay id== 0 ");	
			
			MenuView.printMainMenu();	
			
		}else {

			PersonaService service= new PersonaService();
			Persona p=service.getPersona(id);			
			PersonaView.printPersona(p);
		}
		
		
	}

}
