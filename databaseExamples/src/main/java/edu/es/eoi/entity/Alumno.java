package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "alumno", schema = "beca")
@ToString(exclude = "id")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "apellidos")
	private String apellidos;	
	
	@Column(name = "telefono")
	private String telefono;	
	
	@Column(name = "edad")
	private Double edad;	
	
	@Column(name = "nombre")
	private String nombre;	

}
