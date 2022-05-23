package hibernate_school;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.loader.entity.CacheEntityLoaderHelper.PersistenceContextEntry;

public class TestSaveStudent {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student s = new Student();
		s.setId(1);
		s.setName("Priya");
		s.setPercentage(67.7);
		s.setId(2);
		s.setName("Ramu");
		
		s.setPercentage(70.00);
		s.setId(3);
		s.setName("Priya");
		s.setPercentage(67.7);
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		System.out.println("---------------Done--------------");
	}
}
