package org.shop.api.impl;

import java.util.List;

import org.shop.api.UserService;
import org.shop.data.User;
import org.shop.repository.UserRepository;

public class UserServiceImpl implements UserService {

	private UserRepository repository;
	
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public Long registerUser(User user) {
		return repository.createUser(user);
	}

	@Override
	public User getUserById(Long userId) {
		return repository.getUserById(userId);
	}

	@Override
	public void updateUserProfile(User user) {
		repository.updateUser(user);
	}

	@Override
	public List<User> getUsers() {
		return repository.getUsers();
	}
}
