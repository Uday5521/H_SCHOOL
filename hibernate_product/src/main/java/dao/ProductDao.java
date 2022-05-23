package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public Product insertProduct(Product product) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
	}

	public Product getProductById(int id) {
		Product product = entityManager.find(Product.class, id);
		return product;
	}

	public Product updateProduct(Product product) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		return product;
	}
	
public Product deleteProductById(int id){
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Product product = entityManager.find(Product.class, id);
	entityTransaction.begin();
	entityManager.remove(product);
	entityTransaction.commit();
	return product;
	}

public List<Product> GetMultipleProduct(){
	Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.price=?1 and p.size=?2");
	query.setParameter(1, 50000.0);
	query.setParameter(2, 23);
	
		List<Product> product = query.getResultList();
		return product;
}
}
