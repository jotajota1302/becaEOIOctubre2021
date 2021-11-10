package edu.es.eoi.repository;

public interface MyRepository<E>{
	
	E findById(int id);
	
	void remove(int id);
	
	E update(E entity);
	
	void save(E entity);
	

}
