package edu.es.eoi;

import java.util.ArrayList;
import java.util.List;

import edu.es.eoi.entity.Alumno;
import edu.es.eoi.entity.Perro;
import edu.es.eoi.repository.AlumnoRepositoryJPAImpl;
import edu.es.eoi.repository.MyAbstractRepository;
import edu.es.eoi.repository.MyRepository;
import edu.es.eoi.repository.PerroRepositoryJPAImpl;

public class Main {

	public static void main(String[] args) {
		
	
//			AlumnoRepositoryJDCBImpl repository= new AlumnoRepositoryJDCBImpl();
			MyRepository<Alumno> repository= new AlumnoRepositoryJPAImpl();
			MyAbstractRepository<Perro> repo=new PerroRepositoryJPAImpl();
			
			Alumno al=repository.findById(6);
		
			System.out.println(al);		
			
//			repo.save(new Perro("Pancho","Caniche"));
		
		
			
	}

}
