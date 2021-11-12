package edu.es.eoi;

import java.util.ArrayList;

import edu.es.eoi.entity.Direccion;
import edu.es.eoi.entity.Persona;
import edu.es.eoi.entity.Subscripcion;
import edu.es.eoi.repository.CategoriaRepositoryJPAImpl;
import edu.es.eoi.repository.DireccionRepositoryJPAImpl;
import edu.es.eoi.repository.PersonaRepositoryJPAImpl;
import edu.es.eoi.repository.SubscripcionRepositoryJPAImpl;

public class Main {

	public static void main(String[] args) {
		
		PersonaRepositoryJPAImpl personaRepositoryJPAImpl=new PersonaRepositoryJPAImpl();
		
//		System.out.println(personaRepositoryJPAImpl.findAll());
		
		DireccionRepositoryJPAImpl direccionRepositoryJPAImpl= new DireccionRepositoryJPAImpl();
	
//		System.out.println(direccionRepositoryJPAImpl.findAll());
		
		CategoriaRepositoryJPAImpl categoriaRepositoryJPAImpl= new CategoriaRepositoryJPAImpl();
		
//		System.out.println(categoriaRepositoryJPAImpl.findAll());
		
		SubscripcionRepositoryJPAImpl subscripcionRepositoryJPAImpl= new SubscripcionRepositoryJPAImpl();
		
//		System.out.println(subscripcionRepositoryJPAImpl.findAll());
		
		Persona p= new Persona();
		p.setNombre("JJ");
		p.setMail("jj@gmail.com");
		
		Subscripcion s= new Subscripcion();
		s.setTipo("PREMIUM");
		
		p.setSubscripcion(s);
		s.setPersona(p);

		//relacion 1-N
		
		Direccion direccion1= new Direccion();
		direccion1.setCalle("C/ Direccion Uno");
		direccion1.setCodigopostal("03550");
		
		Direccion direccion2= new Direccion();
		direccion2.setCalle("C/ Direccion Dos");
		direccion1.setCodigopostal("03350");
		
		direccion1.setPersona(p);
		direccion2.setPersona(p);
		
		p.setDirecciones(new ArrayList<Direccion>());
		
		p.getDirecciones().add(direccion1);
		p.getDirecciones().add(direccion2);
		
		//N:N igual pero con 2 set en cada lado	
		
		personaRepositoryJPAImpl.save(p);
		
		personaRepositoryJPAImpl.remove(p.getId());
		
		
	}

}
