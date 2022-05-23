package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSaveTeacherId {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Teacher teacher= entityManager.find(Teacher.class, 1);
	
	if(teacher != null){
		System.out.println("Id is "+teacher.getId());
		System.out.println("Name is "+teacher.getName());
		System.out.println("Percentage is "+teacher.getEmail());
		System.out.println("Phone is "+teacher.getPhone());
		System.out.println("Gender is "+teacher.getGender());
	}else{
		System.out.println("No student exist for given Id");
	}
	
	}

}
