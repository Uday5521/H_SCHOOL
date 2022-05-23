package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Parent parent = new Parent();
		//parent.setId(1) 
		//not required already generate in parent class in id;
		parent.setName("Raju");
		parent.setEmail("raju@gmail.com");
		parent.setPhone(343235232);
		
		entityTransaction.begin();
		
		entityManager.persist(parent);
		
		entityTransaction.commit();
	}

}
