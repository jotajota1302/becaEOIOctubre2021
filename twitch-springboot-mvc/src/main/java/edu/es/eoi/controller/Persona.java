package edu.es.eoi.controller;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Persona {

	private String nombre;
	
	private List<String> telefonos;
	
}
