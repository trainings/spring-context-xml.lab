package org.shop.repository;

import java.util.List;

import org.shop.model.Order;

public interface OrderRepository {
	
	Order getOrderById(Long id);
	
	Long createOrder(Order order);
	
	void updateOrder(Order order);
	
	List<Order> getOrdersByUserId(Long userId);
}
