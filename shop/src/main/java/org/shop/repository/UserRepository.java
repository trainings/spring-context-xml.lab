package org.shop.repository;

import java.util.List;

import org.shop.data.User;

/**
 * Provides repository for manipulating users.
 * 
 * @author Dzmitry_Naskou
 */
public interface UserRepository {
    
    /**
     * Gets the user by id.
     *
     * @param id the id
     * @return the user by id
     */
    User getUserById(Long id);
    
    /**
     * Creates the user.
     *
     * @param user the user
     * @return the user id
     */
    Long createUser(User user);
    
    /**
     * Update user.
     *
     * @param user the user
     */
    void updateUser(User user);
    
    /**
     * Gets the users.
     *
     * @return the users
     */
    List<User> getUsers();
}
