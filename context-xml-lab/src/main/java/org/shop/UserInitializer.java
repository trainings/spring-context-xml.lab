package org.shop;

import org.shop.api.UserService;
import org.shop.data.User;

public class UserInitializer {

	private UserService userService;

	public UserInitializer(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public void initUsers() {
		User user = null;
		
		user = new User();
		user.setUsername("Ivan Ivanov");
		userService.registerUser(user);
		
		user = new User();
		user.setUsername("Petr Petrov");
		userService.registerUser(user);
	}
}
