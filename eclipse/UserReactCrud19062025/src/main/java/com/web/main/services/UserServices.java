package com.web.main.services;


import java.util.List;

import com.web.main.entity.User;

public interface UserServices {
	
	User saveUser(User user);
	List<User> getAllUsers();
	boolean deleteUser(Long id);
	User getUser(Long id);
	User updateUser(Long id, User user);

}
