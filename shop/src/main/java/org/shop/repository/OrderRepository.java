package org.shop.repository;

import java.util.List;

import org.shop.data.Order;

/**
 * Provides repository for manipulating orders.
 * 
 * @author Dzmitry_Naskou
 */
public interface OrderRepository {
    
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
     * @param order the order
     * @return the order id
     */
    Long createOrder(Order order);
    
    /**
     * Update order.
     *
     * @param order the order
     */
    void updateOrder(Order order);
    
    /**
     * Gets the orders by user id.
     *
     * @param userId the user id
     * @return the orders by user id
     */
    List<Order> getOrdersByUserId(Long userId);
}
