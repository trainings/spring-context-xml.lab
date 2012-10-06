package org.shop.model;

public class Proposal extends ElementaryEntity {

	private static final long serialVersionUID = 2419499985539985110L;

	private Product product;

	private Seller seller;
	
	private Double price;
	
	private State state;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
