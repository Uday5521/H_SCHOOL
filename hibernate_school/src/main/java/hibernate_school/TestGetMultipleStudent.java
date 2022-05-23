package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TestGetMultipleStudent {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT s FROM Student s";

		Query query = entityManager.createQuery(sql);
		List<Student> student =  query.getResultList();

		for(Student student1 : student){
			System.out.println("Id is "+student1.getId());
			System.out.println("Name is "+student1.getName());
			System.out.println("Percentage is"+student1.getPercentage());
			System.out.println("-------------------------------------");
		}
	}
}
