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

import edu.es.eoi.dto.BancoDto;
import edu.es.eoi.service.BancoServiceImpl;

@RestController
@RequestMapping(value = "/bancos")
public class BancoController {
		
	@Autowired
	BancoServiceImpl service;
	
	@GetMapping("/{id}")	
	public ResponseEntity<BancoDto> getOne(@PathVariable Integer id) {

		return new ResponseEntity<BancoDto>(service.find(id), HttpStatus.OK);
		
	}
	
	@GetMapping	
	public ResponseEntity<List<BancoDto>> getAll() {
		
		return new ResponseEntity<List<BancoDto>>(service.findAll(), HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<String> createOne(@RequestBody BancoDto dto) {
		
		service.save(dto);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{dni}")
	public ResponseEntity<String> updateOne(@RequestBody BancoDto dto, @PathVariable Integer id) {
		
		if(id.equals(dto.getId())&&service.find(id)!=null) {
			
			service.save(dto);
			
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
			
		}else {
			
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		
		}		
		
	}
	
	@DeleteMapping("/{id}")	
	public ResponseEntity<String> deleteOne(@PathVariable Integer id) {

		service.delete(id);
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping()	
	public ResponseEntity<String> deleteAll() {

		service.deleteAll();
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
}
