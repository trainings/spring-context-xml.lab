package org.shop.model;

import java.util.Date;
import java.util.Set;

public class Order extends ElementaryEntity {

	private static final long serialVersionUID = -1964561045551043905L;
	
	private User user;
	
	private Set<Item> items;
	
	private Date createdDate;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
