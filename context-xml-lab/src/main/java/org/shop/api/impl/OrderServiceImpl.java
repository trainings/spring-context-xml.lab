package org.shop.api.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.shop.api.OrderService;
import org.shop.data.Item;
import org.shop.data.Order;
import org.shop.data.Proposal;
import org.shop.data.User;
import org.shop.repository.ItemRepository;
import org.shop.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

	private OrderRepository orderRepository;
	
	private ItemRepository itemRepository;
	
	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public void setItemRepository(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public Long createOrder(User user, Item... items) {
		//create and save order object
		Order order = new Order();
		order.setUser(user);
		order.setCreatedDate(new Date());
		
		Long orderId = orderRepository.createOrder(order);
		
		//save item objects
		for (Item item : items) {
			item.setOrder(order);
			itemRepository.createItem(item);
		}
		
		return orderId;
	}
	
	public Long createOrder(User user, Proposal... proposals) {
		List<Item> items = new ArrayList<Item>();
		
		for (Proposal proposal : proposals) {
			Item item = new Item();
			item.setProduct(proposal.getProduct());
			item.setPrice(proposal.getPrice());
			
			items.add(item);
		}
		
		return createOrder(user, items.toArray(new Item[items.size()]));
	}

	@Override
	public Order getOrderById(Long id) {
		return orderRepository.getOrderById(id);
	}

	@Override
	public void updateOrder(Order order) {
		orderRepository.updateOrder(order);
	}

	@Override
	public List<Order> getOrdersByUser(User user) {
		return getOrdersByUserId(user.getId());
	}

	@Override
	public List<Order> getOrdersByUserId(Long userId) {
		return orderRepository.getOrdersByUserId(userId);
	}

	@Override
	public List<Item> getOrderItemsByOrderId(Long orderId) {
		return itemRepository.getItemsByOrderId(orderId);
	}
}
