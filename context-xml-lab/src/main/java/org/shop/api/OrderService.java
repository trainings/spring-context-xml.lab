package org.shop.api;

import java.util.List;

import org.shop.data.Item;
import org.shop.data.Order;
import org.shop.data.Proposal;
import org.shop.data.User;

public interface OrderService {
	
	Order getOrderById(Long id);
	
	Long createOrder(User user, Item... items);
	
	Long createOrder(User user, Proposal... proposals);
	
	void updateOrder(Order order);
	
	List<Order> getOrdersByUser(User user);
	
	List<Order> getOrdersByUserId(Long userId);
}
