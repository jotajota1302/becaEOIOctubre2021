package edu.es.eoi.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reserva {

	private Date fecha;
	private String codigo;
	private Usuario user;
	private Pista pista;
	
}
