package edu.es.eoi;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.entity.Entidad1;
import edu.es.eoi.entity.Entidad2;
import edu.es.eoi.repository.Entidad1Repository;

@SpringBootTest
class TwitchSpringbootDataApplicationTests {

	@Autowired
	Entidad1Repository repo;

	@Test
	void testFind() {

		Entidad1 entity1 = new Entidad1();
		entity1.setCampo("entidad 1");
		entity1.setEntidad2(new ArrayList<Entidad2>());
				
		Entidad2 entity2 = new Entidad2();
		entity2.setCampo("entidad 2");

		entity1.getEntidad2().add(entity2);
		entity2.setEntidad1(entity1);

		repo.save(entity1);	
					
		Assertions.assertEquals("entidad 1", repo.findById(entity1.getId()).get().getCampo());
		Assertions.assertEquals("entidad 1", repo.findByCampo("entidad 1").getCampo());
	}

}
