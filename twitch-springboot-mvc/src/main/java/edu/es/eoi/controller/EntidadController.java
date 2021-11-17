package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.EntidadDto;
import edu.es.eoi.service.EntidadService;

@RestController
@RequestMapping(value = "/entidad")
public class EntidadController {
		
	@Autowired
	EntidadService service;
	
	@GetMapping("/{id}")	
	public ResponseEntity<EntidadDto> getEntity(@PathVariable Integer id) {

		return new ResponseEntity<EntidadDto>(service.findEntidad(id), HttpStatus.OK);
		
	}
	
	@PostMapping	
	public EntidadDto createEntity(@RequestBody EntidadDto dto) {
	
		return service.save(dto);
		
	}

	
}
