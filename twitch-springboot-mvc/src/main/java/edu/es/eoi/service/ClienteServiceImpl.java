package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public ClienteDto find(String id) {
		
		Cliente c=repo.findById(id).get();
		
		ClienteDto dto=new ClienteDto();
		
		BeanUtils.copyProperties(c, dto);
		
		return dto;
	}
	
	public List<ClienteDto> findAll(){
		
		List<Cliente> clientes = repo.findAll();
		List<ClienteDto> lista= new ArrayList<ClienteDto>();
		
		for (Cliente cliente : clientes) {
			
			ClienteDto dto=new ClienteDto();			
			BeanUtils.copyProperties(cliente, dto);
			
			lista.add(dto);
			
		}
		
		return lista;
		
	}

	public void save(ClienteDto dto) {
		
		Cliente entity=new Cliente();			
		BeanUtils.copyProperties(dto, entity);
		
		repo.save(entity);
		
	}

	public void delete(String id) {
		
		repo.deleteById(id);
		
	}

	public void deleteAll() {
		
		repo.deleteAll();
		
	}
	

	
}
