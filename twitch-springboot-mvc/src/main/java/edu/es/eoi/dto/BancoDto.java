package edu.es.eoi.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BancoDto {

	private String nombre;

	private String ciudad;

	private List<CuentaDto> cuentas;

	
		
}
