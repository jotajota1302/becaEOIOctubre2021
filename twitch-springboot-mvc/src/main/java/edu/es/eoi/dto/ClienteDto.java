package edu.es.eoi.dto;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {

	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private String mail;
	
	private Date fechaAlta;
	
	private String telefono;
	
	private String direccion;
	
	private List<CuentaDto> cuentas;

}
