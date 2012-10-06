package org.shop.model;

public class Item extends ElementaryEntity {

	private static final long serialVersionUID = 2715339873182595898L;

	private Order order;
	
	private Product product;
	
	private Double price;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
