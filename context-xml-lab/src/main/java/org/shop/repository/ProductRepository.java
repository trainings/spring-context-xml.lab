package org.shop.repository;

import java.util.List;

import org.shop.model.Product;

public interface ProductRepository {
	
	Product getProductById(Long productId);
	
	List<Product> getProducts();
	
	List<Product> getProductsByName(String name);
	
	Long createProduct(Product product);
	
	void updateProduct(Product product);
	
	void deleteProduct(Long productId);
}
