package hibernate_school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Visitor v = new Visitor();
		
		v.setId(7);
		v.setName("dimple");
		v.setEmail("dimple@gmail.com");
		v.setGender('f');
		v.setDob(LocalDate.now());
		v.setVisitorDateTime(LocalDateTime.now());
		
		entityTransaction.begin();
		entityManager.persist(v);
		entityTransaction.commit();
		
		System.out.println("---------------Done--------------");
	}

}
