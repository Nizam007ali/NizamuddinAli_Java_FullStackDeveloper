package com.web.main.service;

import java.util.List;

import com.web.main.entity.User;

public interface UserMethodInterface {

	public boolean insert(User user);
	public boolean update(User user, long id);
	public boolean delete(long id);
	public List<User> getAllUsers();
	
}
