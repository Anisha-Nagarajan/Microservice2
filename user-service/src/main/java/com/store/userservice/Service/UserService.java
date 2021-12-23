package com.store.userservice.Service;

import java.util.List;

import com.store.userservice.Entity.User;

public interface UserService {

    public List<User> getAllUsers();
	public User getUserById(Long id);
	public User saveUser(User user);
	public User findByUsername(String username);
}
