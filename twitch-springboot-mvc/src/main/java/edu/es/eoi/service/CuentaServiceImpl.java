package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.CuentaDto;
import edu.es.eoi.entity.Cuenta;
import edu.es.eoi.repository.CuentaRepository;

@Service
public class CuentaServiceImpl {

	@Autowired
	CuentaRepository repo;
	
	public CuentaDto find(Integer id) {
		
		Cuenta c=repo.findById(id).get();
		
		CuentaDto dto=new CuentaDto();
		
		BeanUtils.copyProperties(c, dto);
		
		return dto;
	}
	
	public List<CuentaDto> findCuentasByDni(String dni) {
		
		List<Cuenta> cuentas=repo.findByClienteDni(dni);
		List<CuentaDto> lista= new ArrayList<CuentaDto>();
		
		for (Cuenta cuenta : cuentas) {
			
			CuentaDto dto=new CuentaDto();			
			BeanUtils.copyProperties(cuenta, dto);
			dto.setDni(cuenta.getCliente().getDni().substring(0,4).concat("*****"));
			dto.setBanco(cuenta.getBanco().getNombre());
			
			lista.add(dto);
			
		}			
		
		return lista;
	}
	
	public List<CuentaDto> findAll(){
		
		List<Cuenta> cuentas = repo.findAll();
		List<CuentaDto> lista= new ArrayList<CuentaDto>();
		
		for (Cuenta cuenta : cuentas) {
			
			CuentaDto dto=new CuentaDto();			
			BeanUtils.copyProperties(cuenta, dto);
			dto.setDni(cuenta.getCliente().getDni());
			dto.setBanco(cuenta.getBanco().getNombre());
			
			lista.add(dto);
			
		}
		
		return lista;
		
	}

	public void save(CuentaDto dto) {
		
		Cuenta entity=new Cuenta();			
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
