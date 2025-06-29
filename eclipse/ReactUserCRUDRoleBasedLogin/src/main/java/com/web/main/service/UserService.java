package com.web.main.service;

import java.util.List;

import com.web.main.entity.User;

public interface UserService {
	public User saveUser(User user);
	public List<User> getAllUsers();
	public boolean deleteUser(Long id);
	public User findById1(Long id);
	public boolean updateUser(Long id,User user);
	public User login(String email, String password);
}
