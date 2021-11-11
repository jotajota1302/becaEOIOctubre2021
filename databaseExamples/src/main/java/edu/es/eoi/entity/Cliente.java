package edu.es.eoi.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter	
@Setter
@Entity(name = "clientes")
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;
		
	
}
