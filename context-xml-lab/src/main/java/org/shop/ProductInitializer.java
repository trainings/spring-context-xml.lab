package org.shop;

import org.shop.api.ProductService;
import org.shop.data.Product;

public class ProductInitializer {
	
	private ProductService productService;

	public ProductInitializer(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	public void initProducts() {
		Product product = null;
		
		product = new Product();
		product.setName("Samsung Galaxy Tab");
		product.setDescription("10.1-Inch, 16GB, Wi-Fi");
		productService.createProduct(product);
		
		product = new Product();
		product.setName("Kindle Fire");
		product.setDescription("Wi-Fi, Full Color 7, Multi-Touch Display");
		productService.createProduct(product);
		
		product = new Product();
		product.setName("Kindle Touch");
		product.setDescription("Wi-Fi, 6 E Ink Display");
		productService.createProduct(product);
		
		product = new Product();
		product.setName("Samsung S5830L Galaxy Ace");
		product.setDescription("Samsung S5830L Galaxy Ace");
		productService.createProduct(product);
	}
}
