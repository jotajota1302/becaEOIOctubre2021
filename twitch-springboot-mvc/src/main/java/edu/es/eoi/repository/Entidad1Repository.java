package edu.es.eoi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Entidad1;

@Repository
public interface Entidad1Repository extends JpaRepository<Entidad1, Integer> {
	
	public List<Entidad1> findByCampoContaining(String text);	

	
}
