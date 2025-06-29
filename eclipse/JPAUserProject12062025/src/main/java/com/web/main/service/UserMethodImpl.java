package com.web.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.entity.User;
import com.web.main.repository.UserRepository;

@Service
public class UserMethodImpl implements UserMethodInterface {

	@Autowired
	UserRepository userRepository;

	@Override
	public boolean insert(User user) {
		if (user == null || user.getEmail() == null || user.getPass() == null) {
			return false; // Invalid user data
		}
		if (userRepository.existsById(user.getId())) {
			System.out.println("User with ID " + user.getId() + " already exists.");
			return false; 
		}
		User user1 = userRepository.save(user);
		return user1 != null;
	}

	@Override
	public boolean update(User user, long id) {
		if (!userRepository.existsById(id)) {
			return false;
		}
		User user1 = userRepository.save(user);
		return user1 != null;
	}

	@Override
	public boolean delete(long id) {
		if (!userRepository.existsById(id)) {
			return false;
		}
		userRepository.deleteById(id);
		return true;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

}
