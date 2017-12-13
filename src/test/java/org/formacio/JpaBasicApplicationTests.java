package org.formacio;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.formacio.domain.Persona;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaBasicApplicationTests {

	@PersistenceContext 
	private EntityManager em;
	
	@Transactional
	@Commit
	@Test
	public void test_alta() {
		Persona nova = new Persona();
		nova.setNom("Nova persona");
		em.persist(nova);
		
		System.out.println(nova);
	}
}
