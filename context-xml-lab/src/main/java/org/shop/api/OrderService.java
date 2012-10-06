package org.shop.api;

import java.util.List;

import org.shop.model.Item;
import org.shop.model.Order;
import org.shop.model.Proposal;
import org.shop.model.User;

public interface OrderService {
	
	Order getOrderById(Long id);
	
	Long createOrder(User user, Item... items);
	
	Long createOrder(User user, Proposal... proposals);
	
	void updateOrder(Order order);
	
	List<Order> getOrdersByUser(User user);
	
	List<Order> getOrdersByUserId(Long userId);
	
	List<Item> getOrderItemsByOrderId(Long orderId);
}
