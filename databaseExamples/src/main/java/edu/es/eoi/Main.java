package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Alumno;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Perro;
import edu.es.eoi.repository.AlumnoRepositoryJPAImpl;
import edu.es.eoi.repository.ClienteRepositoryJPAImpl;
import edu.es.eoi.repository.MyAbstractRepository;
import edu.es.eoi.repository.MyRepository;
import edu.es.eoi.repository.PerroRepositoryJPAImpl;

public class Main {

	public static void main(String[] args) {
		
	
//			AlumnoRepositoryJDCBImpl repository= new AlumnoRepositoryJDCBImpl();
//			MyRepository<Alumno,Integer> repository= new AlumnoRepositoryJPAImpl();
//			MyAbstractRepository<Perro> repo=new PerroRepositoryJPAImpl();
//			
//			Alumno al=repository.findById(6);
//		
//			System.out.println(al);		
//			
////			repo.save(new Perro("Pancho","Caniche"));
//			
//			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ALUMNO_PU");
//			EntityManager em = emf.createEntityManager();			
//			System.out.println(em.find(Alumno.class, 6).getApellidos());
//			
//			emf = Persistence.createEntityManagerFactory("BANCO_PU");
//			em = emf.createEntityManager();			
//			
//			System.out.println(em.find(Cliente.class, "03765983S").getNombre());
		
			MyRepository<Cliente, String> clienteRepository=new ClienteRepositoryJPAImpl();
			
			System.out.println(clienteRepository.findById("03765983S").getNombre());
	
			
	}

}
