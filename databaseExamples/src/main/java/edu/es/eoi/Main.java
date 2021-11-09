package edu.es.eoi;

import edu.es.eoi.entity.Alumno;
import edu.es.eoi.repository.AlumnoRepository;
import edu.es.eoi.repository.AlumnoRepositoryJDCBImpl;

public class Main {

	public static void main(String[] args) {
		
	
			AlumnoRepository repository= new AlumnoRepositoryJDCBImpl();
//			AlumnoRepository repository= new AlumnoRepositoryJPAImpl();
			
			Alumno al=repository.findById(1);
		
			System.out.println(al.getApellidos());		
		
	}

}
