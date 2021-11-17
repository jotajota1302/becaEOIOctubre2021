package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.service.ClienteServiceImpl;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
		
	@Autowired
	ClienteServiceImpl service;
	
	@GetMapping("/{id}")	
	public ResponseEntity<ClienteDto> getEntity(@PathVariable String id) {

		return new ResponseEntity<ClienteDto>(service.findCliente(id), HttpStatus.OK);
		
	}
	

	
}
