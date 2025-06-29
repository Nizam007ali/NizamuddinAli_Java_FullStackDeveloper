package com.web.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.entity.User;
import com.web.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		if (user.getName() == null || user.getEmail() == null || user.getRole() == null || user.getPassword() == null) {
			return null; // Invalid user data
		} 
		userRepository.save(user);
		return user; 
	}
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public boolean deleteUser(Long id) {
		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
			return true; // User deleted successfully
		}
		return false; // User not found
	}
	
	@Override
	public User findById1(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	@Override
	public boolean updateUser(Long id,User user) {
		if (userRepository.existsById(id)) {
			User existingUser = userRepository.findById(id).orElse(null);
			if (existingUser != null) {
				existingUser.setName(user.getName());
				existingUser.setEmail(user.getEmail());
				existingUser.setRole(user.getRole());
				existingUser.setPassword(user.getPassword());
				userRepository.save(existingUser);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public User login(String email, String password) {
		User user = userRepository.findAll().stream()
				.filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password))
				.findFirst()
				.orElse(null);
		if (user != null) {
			return user; 
		}
		return null; 
	}
	
}
