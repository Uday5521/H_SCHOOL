package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Teacher t = new Teacher();
		
		t.setId(1);
		t.setName("Dinga");
		t.setEmail("dinga@gmail.com");
		t.setPhone(828323232);
		t.setGender('m');
		
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();
		
		System.out.println("---------------Done--------------");
	}
	
}
