package edu.es.eoi;

import java.util.List;

import edu.es.eoi.entity.Banco;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;
import edu.es.eoi.repository.BancoRepositoryJPAImpl;
import edu.es.eoi.repository.ClienteRepositoryJPAImpl;
import edu.es.eoi.repository.MyRepository;

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
						
			List<Cuenta> cuentas=clienteRepository.findById("03765983S").getCuentas();			
				
			
			//hacer los puntos del ejercicio
			
	}

}
