package controller;

import java.util.List;

import com.google.protobuf.Service;

import dto.Product;
import service.ProductService;

public class GetProduct {
	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		/*//Get products
		Product product = productService.getProductById(2);
		System.out.println(product.getName());*/
		
		/*//Update
		Product product = new Product();
		product.setBrand("LAPTOP");
		product.setPrice(45005.55);
		Product product1 = productService.updateProduct(product);*/
		
		
		/*//Delete
		Product product1 = productService.deleteProductById(1);*/
		
		List<Product> product4 = productService.GetMultipleProduct();
		
		for(Product product5: product4){
			System.out.println(product5.getBrand());
			System.out.println(product5.getName());
			
		}
	}
}
