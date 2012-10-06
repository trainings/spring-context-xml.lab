package org.shop.api;

import java.util.List;

import org.shop.model.Product;

public interface ProductService {
	
	Product getProductById(Long id);

	List<Product> getProducts();
	
	List<Product> getProductsByName(String name);
	
	Long createProduct(Product product);
	
	void updateProduct(Product product);
	
	void deleteProduct(Long productId);
}
