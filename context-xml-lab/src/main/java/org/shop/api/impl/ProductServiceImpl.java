package org.shop.api.impl;

import java.util.List;

import org.shop.api.ProductService;
import org.shop.data.Product;
import org.shop.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	private ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public Product getProductById(Long id) {
		return repository.getProductById(id);
	}

	@Override
	public List<Product> getProducts() {
		return repository.getProducts();
	}

	@Override
	public List<Product> getProductsByName(String name) {
		return repository.getProductsByName(name);
	}

	@Override
	public Long createProduct(Product product) {
		return repository.createProduct(product);
	}

	@Override
	public void updateProduct(Product product) {
		repository.updateProduct(product);
	}

	@Override
	public void deleteProduct(Long productId) {
		repository.deleteProduct(productId);
	}
}
