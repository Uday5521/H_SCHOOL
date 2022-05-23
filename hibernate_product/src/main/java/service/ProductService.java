package service;

import java.util.List;

import dao.ProductDao;
import dto.Product;

public class ProductService {
	ProductDao productDao = new ProductDao();
	
	public Product insertProduct(Product product){
		return productDao.insertProduct(product);
	}
	
	public Product getProductById(int id){
		return productDao.getProductById(id);
	}
	
	public Product updateProduct(Product product){
		return productDao.updateProduct(product);
	}
	
	public Product deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}
	
	public List GetMultipleProduct(){
		return productDao.GetMultipleProduct();
	}
}
