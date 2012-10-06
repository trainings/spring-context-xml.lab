package org.shop.repository;

import java.util.List;

import org.shop.model.Item;

public interface ItemRepository {
	
	Long createItem(Item item);
	
	void deleteItem(Long itemId);
	
	List<Item> getItemsByOrderId(Long orderId);
}
