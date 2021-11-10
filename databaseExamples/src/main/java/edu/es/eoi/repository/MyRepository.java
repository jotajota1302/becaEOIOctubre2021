package edu.es.eoi.repository;

public interface MyRepository<E,PK>{
	
	E findById(PK id);
	
	void remove(PK id);
	
	E update(E e);
	
	void save(E e);
	

}
