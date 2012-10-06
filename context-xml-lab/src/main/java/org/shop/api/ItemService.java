package org.shop.api;

import java.util.List;

import org.shop.data.Item;

public interface ItemService {

	Long createItem(Item item);

	void deleteItem(Long itemId);

	List<Item> getItemsByOrderId(Long orderId);
}