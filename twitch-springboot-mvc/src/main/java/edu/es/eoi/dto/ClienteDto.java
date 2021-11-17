package edu.es.eoi.dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {

	private String nombre;	
	
	private String apellidos;
	
	private String mail;
	
	@Column(name = "FECHA_ALTA")
	private Date fechaAlta;
	
	private String telefono;

	private String direccion;

	private List<CuentaDto> cuentas;



}
