package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<ClienteDto> getOne(@PathVariable String id) {

		return new ResponseEntity<ClienteDto>(service.findCliente(id), HttpStatus.OK);
		
	}
	
	@GetMapping	
	public ResponseEntity<List<ClienteDto>> getAll() {
		
		return new ResponseEntity<List<ClienteDto>>(service.findAll(), HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<String> createOne(@RequestBody ClienteDto dto) {
		
		service.saveCliente(dto);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{dni}")
	public ResponseEntity<String> updateOne(@RequestBody ClienteDto dto, @PathVariable String dni) {
		
		if(dni.equals(dto.getDni())&&service.findCliente(dni)!=null) {
			
			service.saveCliente(dto);
			
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
			
		}else {
			
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		
		}		
		
	}
	
	@DeleteMapping("/{id}")	
	public ResponseEntity<String> deleteOne(@PathVariable String id) {

		service.delete(id);
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping()	
	public ResponseEntity<String> deleteAll() {

		service.deleteAll();
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
}
