package edu.es.eoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.EntidadDto;
import edu.es.eoi.entity.Entidad1;
import edu.es.eoi.repository.Entidad1Repository;

@Service
public class EntidadService {

	@Autowired
	Entidad1Repository repo;
	
	public EntidadDto findEntidad(int id) throws Exception {
		
		Entidad1 entity = repo.findById(id).get();
	
		EntidadDto dto= EntidadDto.builder()								
								  .campo(entity.getCampo())
								  .number(entity.getNumber())
								  .build();
		
		return dto;
	}
	
	public EntidadDto save(EntidadDto dto) {
		
		Entidad1 entity = new Entidad1();
		entity.setCampo(dto.getCampo());
	
		repo.save(entity);
				
		return dto;
	}
	
	
}
