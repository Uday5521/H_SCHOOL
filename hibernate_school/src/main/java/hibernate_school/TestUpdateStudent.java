package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateStudent {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student = new Student();
		student.setId(1);
		student.setName("Dinga");
		student.setPercentage(56.34);

		entityTransaction.begin();

		entityManager.persist(student);
		// to add the data into table

		//entityManager.merge(student);
		//to rename or update into table

		entityTransaction.commit();
	}
}
