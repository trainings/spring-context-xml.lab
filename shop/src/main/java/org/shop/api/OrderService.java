package org.shop.api;

import java.util.List;

import org.shop.data.Item;
import org.shop.data.Order;
import org.shop.data.Proposal;
import org.shop.data.User;

/**
 * Provides API for manipulating orders.
 * 
 * @author Dzmitry_Naskou
 * @see ItemService
 */
public interface OrderService {
    
    /**
     * Gets the order by id.
     *
     * @param id the id
     * @return the order by id
     */
    Order getOrderById(Long id);
    
    /**
     * Creates the order.
     *
     * @param user the user
     * @param items the items
     * @return the order id
     */
    Long createOrder(User user, Item... items);
    
    /**
     * Creates the order.
     *
     * @param user the user
     * @param proposals the proposals
     * @return the order id
     */
    Long createOrder(User user, Proposal... proposals);
    
    /**
     * Update order.
     *
     * @param order the order
     */
    void updateOrder(Order order);
    
    /**
     * Gets the orders by user.
     *
     * @param user the user
     * @return the orders by user
     */
    List<Order> getOrdersByUser(User user);
    
    /**
     * Gets the orders by user id.
     *
     * @param userId the user id
     * @return the orders by user id
     */
    List<Order> getOrdersByUserId(Long userId);
}
