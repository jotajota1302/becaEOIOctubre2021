package edu.es.eoi.view;

import edu.es.eoi.entity.Persona;

public class PersonaView {
	
	public static void printPersona(Persona persona) {
		
		System.out.println("Nombre: " + persona.getNombre()) ;
		System.out.println("Nombre: " + persona.getMail()) ;
	}

}
