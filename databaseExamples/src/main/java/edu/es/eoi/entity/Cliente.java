package edu.es.eoi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "clientes")
public class Cliente {
	
	@Id
	@Column(name = "DNI", unique = true)
	private String dni;

	@Column(name = "NOMBRE")
	private String nombre;	

	@Column(name = "alta")
	private Date fechaAlta;
	
	@Column(name = "DIRECCION")
	private String direccion;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
//	private List<Cuenta> cuentas;
	
	
}