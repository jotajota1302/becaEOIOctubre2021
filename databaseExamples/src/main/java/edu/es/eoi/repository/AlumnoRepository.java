package edu.es.eoi.repository;

import edu.es.eoi.entity.Alumno;

public interface AlumnoRepository {

	Alumno findById(int id);

	void save(Alumno alumno);

	Alumno update(Alumno alumno);

	void remove(int id);

}