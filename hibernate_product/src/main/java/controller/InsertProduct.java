package controller;

import dto.Product;
import service.ProductService;

public class InsertProduct {
	public static void main(String[] args) {
		
		Product product = new Product();
	
		product.setName("Jerry");
		product.setBrand("MOBILE");
		product.setPrice(50000.00);
		product.setType("MI");
		product.setSize(23);
		product.setRatings(45);
		
		ProductService productService = new ProductService();
						productService.insertProduct(product);
	}

}
