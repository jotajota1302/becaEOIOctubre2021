package edu.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Entidad2;

@Repository
public interface Entidad2Repository extends JpaRepository<Entidad2, Integer> {

}
