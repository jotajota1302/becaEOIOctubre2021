package edu.es.eoi;

import edu.es.eoi.entity.Subscripcion;
import edu.es.eoi.repository.CategoriaRepositoryJPAImpl;
import edu.es.eoi.repository.DireccionRepositoryJPAImpl;
import edu.es.eoi.repository.PersonaRepositoryJPAImpl;
import edu.es.eoi.repository.SubscripcionRepositoryJPAImpl;

public class Main {

	public static void main(String[] args) {
		
		PersonaRepositoryJPAImpl personaRepositoryJPAImpl=new PersonaRepositoryJPAImpl();
		
		System.out.println(personaRepositoryJPAImpl.findAll());
		
		DireccionRepositoryJPAImpl direccionRepositoryJPAImpl= new DireccionRepositoryJPAImpl();
	
		System.out.println(direccionRepositoryJPAImpl.findAll());
		
		CategoriaRepositoryJPAImpl categoriaRepositoryJPAImpl= new CategoriaRepositoryJPAImpl();
		
		System.out.println(categoriaRepositoryJPAImpl.findAll());
		
		SubscripcionRepositoryJPAImpl subscripcionRepositoryJPAImpl= new SubscripcionRepositoryJPAImpl();
		
		System.out.println(subscripcionRepositoryJPAImpl.findAll());
		
	}

}
