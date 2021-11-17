package edu.es.eoi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaDto {

	private double saldo;

	private ClienteDto cliente;

	private BancoDto banco;
	
}
