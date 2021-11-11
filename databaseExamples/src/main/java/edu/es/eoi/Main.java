package edu.es.eoi;

import java.util.ArrayList;

import edu.es.eoi.entity.Banco;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;
import edu.es.eoi.repository.BancoRepositoryJPAImpl;
import edu.es.eoi.repository.ClienteRepositoryJPAImpl;
import edu.es.eoi.repository.CuentaRepositoryJPAImpl;
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
		
			ClienteRepositoryJPAImpl clienteRepository=new ClienteRepositoryJPAImpl();
							
//			Crear 5 Clientes
			
			Cliente c1=new Cliente();
					
//			clienteRepository.save(c1);		
			
			System.out.println("created");
			
//			clienteRepository.remove(c1.getDni());		
			
			System.out.println("deleted");
						
//			•Crear 5 Bancos IGUAL que lo anterior
//			•Recuperar un Cliente por su Clave Principal DONE
//			•Recuperar un Banco por su Clave Principal DONE
						
//			•Modificaremos un Cliente
//			•Modificaremos un Banco
			
			Cliente updated=clienteRepository.findById("03765983S");			
			updated.setNombre("Pepe");			
			clienteRepository.update(updated);
			
//			•Eliminaremos un Cliente
//			•Eliminaremos un Banco
									
//			•Obtendremos la lista de todos los clientes.
//			•Obtendremos la lista de todos los bancos.
			
//			clienteRepository.findAll();
						
//			•Crearemos 5 cuentas (Habrán clientes con varias cuentas)
//			•Modificaremos cuentas
//			•Eliminaremos cuentas
//			•Obtendremos las cuentas por banco
//			•Obtendremos las cuentas por cliente
//			•Obtendremos un listado de todos los clientes y sus cuentas (tengan cuenta o no)
			
			//cliente-cuenta-banco
			
			//datos cliente -> ID
			
			//recuperar info BANCO ->ID
			
			//Crear un registro en CUENTAS con ID Cliente ID Banco , mas saldo etc...
			
			Cliente cliente= new Cliente();
			cliente.setDni("JJJJADSAD");
			cliente.setNombre("DUMMY");
						
			BancoRepositoryJPAImpl repo= new BancoRepositoryJPAImpl();
						
			Banco banco= repo.findById(1);
					 
			Cuenta cuenta= new Cuenta();
			cuenta.setSaldo(3000);
			cuenta.setBanco(banco);
			cuenta.setCliente(cliente);
			
			if(cliente.getCuentas()==null) {
				cliente.setCuentas(new ArrayList<Cuenta>());
				cliente.getCuentas().add(cuenta);
			}else {
				cliente.getCuentas().add(cuenta);
			}
			
			if(banco.getCuentas()==null) {
				banco.setCuentas(new ArrayList<Cuenta>());
				banco.getCuentas().add(cuenta);
			}else {
				banco.getCuentas().add(cuenta);
			}
			
//			clienteRepository.save(cliente);
			
			CuentaRepositoryJPAImpl cuentaRepositoryJPAImpl= new CuentaRepositoryJPAImpl();
			
			Cuenta temp=cuentaRepositoryJPAImpl.findById(22);
			
			temp.getBanco().setDireccion("ADRESS UPDATED");
			
			cuentaRepositoryJPAImpl.save(temp);
			
			//cuentas por banco
			
			BancoRepositoryJPAImpl bancoRepositoryJPAImpl= new BancoRepositoryJPAImpl();
			banco=bancoRepositoryJPAImpl.findById(1);
			
			for (Cuenta c : banco.getCuentas()) {
				System.out.println(c.getCliente().getDni());
			}	
		
			clienteRepository.findAll();
	}

}
