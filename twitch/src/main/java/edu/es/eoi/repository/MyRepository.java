package edu.es.eoi.repository;

import java.util.List;

public interface MyRepository<E,PK>{
	
	E findById(PK id);
	
	void remove(PK id);
	
	E update(E e);
	
	void save(E e);
	
	List<E> findAll();
	
}
