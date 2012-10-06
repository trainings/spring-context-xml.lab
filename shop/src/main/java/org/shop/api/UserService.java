package org.shop.api;

import java.util.List;

import org.shop.data.User;

// TODO: Auto-generated Javadoc
/**
 * Provides API for manipulating users.
 * @author Dzmitry_Naskou
 *
 */
public interface UserService {
    
    /**
     * Register the user.
     *
     * @param user the user
     * @return the user id
     */
    Long registerUser(User user);
    
    /**
     * Gets the user by id.
     *
     * @param id the id
     * @return the user by id
     */
    User getUserById(Long id);
    
    /**
     * Update user profile.
     *
     * @param user the user
     */
    void updateUserProfile(User user);
    
    /**
     * Gets the users.
     *
     * @return the users
     */
    List<User> getUsers();
}
