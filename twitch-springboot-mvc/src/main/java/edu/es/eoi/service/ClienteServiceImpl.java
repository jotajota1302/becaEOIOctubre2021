package edu.es.eoi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClienteRepository;

@Service
public class ClienteServiceImpl {

	@Autowired
	ClienteRepository repo;
	
	public ClienteDto findCliente(String id) {
		
		Cliente c=repo.findById(id).get();
		
		ClienteDto dto=new ClienteDto();
		
		BeanUtils.copyProperties(c, dto);
		
		return dto;
	}
	

	
}
