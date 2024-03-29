package com.revature.services;

import java.util.List;

import com.revature.models.User;

public interface UserService {
	
	public List<User> findByUsername(String username);
	
	public User findById(Integer id);
	
	public List<User> findAll();
	
	public User saveUser(User user);
	
	public void delete(User user);
}
