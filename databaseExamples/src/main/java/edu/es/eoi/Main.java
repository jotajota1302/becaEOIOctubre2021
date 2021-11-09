package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("MYDATABASE_PU");
			EntityManager em=emf.createEntityManager();
			
			Alumno alumno=em.find(Alumno.class,1);
			
			System.out.println(alumno.getApellidos());
			System.out.println(alumno.getDni());
	
			Alumno newAlumno= new Alumno();
			newAlumno.setApellidos("TEST");
			
			em.getTransaction().begin();			
			em.persist(newAlumno);
			em.getTransaction().commit();
			
			em.getTransaction().begin();	
			newAlumno.setApellidos("modified");
			newAlumno=em.merge(newAlumno);
			em.getTransaction().commit();
			
			em.getTransaction().begin();			
			em.remove(newAlumno);
			em.getTransaction().commit();
		
	}

}
