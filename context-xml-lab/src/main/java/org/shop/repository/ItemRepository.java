package org.shop.repository;

import java.util.List;

import org.shop.data.Item;

public interface ItemRepository {
	
	Long createItem(Item item);
	
	void deleteItem(Long itemId);
	
	List<Item> getItemsByOrderId(Long orderId);
}
