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

import edu.es.eoi.dto.CuentaDto;
import edu.es.eoi.service.BancoServiceImpl;
import edu.es.eoi.service.ClienteServiceImpl;
import edu.es.eoi.service.CuentaServiceImpl;

@RestController
@RequestMapping(value = "/cuentas")
public class CuentasController {
		
	@Autowired
	CuentaServiceImpl service;
	
	@Autowired
	BancoServiceImpl bancoService;
	
	@Autowired
	ClienteServiceImpl clienteService;
	
	@GetMapping("/{id}")	
	public ResponseEntity<CuentaDto> getOne(@PathVariable Integer id) {

		return new ResponseEntity<CuentaDto>(service.find(id), HttpStatus.OK);
		
	}
	
	@GetMapping("/{dni}/clientes")	
	public ResponseEntity<List<CuentaDto>> getOne(@PathVariable String dni) {

		return new ResponseEntity<List<CuentaDto>>(service.findCuentasByDni(dni), HttpStatus.OK);
		
	}
	
	@GetMapping	
	public ResponseEntity<List<CuentaDto>> getAll() {
		
		return new ResponseEntity<List<CuentaDto>>(service.findAll(), HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<String> createOne(@RequestBody CuentaDto dto) {
			
		service.save(dto);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{dni}")
	public ResponseEntity<String> updateOne(@RequestBody CuentaDto dto, @PathVariable Integer id) {
		
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
