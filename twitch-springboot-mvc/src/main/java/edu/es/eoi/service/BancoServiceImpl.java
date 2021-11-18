package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.BancoDto;
import edu.es.eoi.entity.Banco;
import edu.es.eoi.repository.BancoRepository;

@Service
public class BancoServiceImpl {

	@Autowired
	BancoRepository repo;
	
	public BancoDto find(Integer id) {
		
		Banco c=repo.findById(id).get();
		
		BancoDto dto=new BancoDto();
		
		BeanUtils.copyProperties(c, dto);
		
		return dto;
	}
	
	public List<BancoDto> findAll(){
		
		List<Banco> bancos = repo.findAll();
		List<BancoDto> lista= new ArrayList<BancoDto>();
		
		for (Banco banco : bancos) {
			
			BancoDto dto=new BancoDto();			
			BeanUtils.copyProperties(banco, dto);
			
			lista.add(dto);
			
		}
		
		return lista;
		
	}

	public void save(BancoDto dto) {
		
		Banco entity=new Banco();			
		BeanUtils.copyProperties(dto, entity);
		
		repo.save(entity);
		
	}

	public void delete(Integer id) {
		
		repo.deleteById(id);
		
	}

	public void deleteAll() {
		
		repo.deleteAll();
		
	}
	

	
}
