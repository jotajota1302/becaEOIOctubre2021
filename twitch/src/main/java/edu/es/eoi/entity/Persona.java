package edu.es.eoi.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String nombre;
	@Column
	private String mail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subscripcion", referencedColumnName = "id")
	private Subscripcion subscripcion;
	
	@OneToMany(mappedBy = "persona")
	private List<Direccion> direcciones;
		
	@ManyToMany
	@JoinTable(
	  name = "persona_categoria", 
	  joinColumns = @JoinColumn(name = "persona"), 
	  inverseJoinColumns = @JoinColumn(name = "categoria"))
	  Set<Categoria> categorias;
	
}
