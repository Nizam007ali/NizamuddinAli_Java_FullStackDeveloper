package com.web.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.entity.User;
import com.web.main.services.UserServices;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

	@Autowired
	private UserServices userServices;
	
	@PostMapping
	public String saveUser(@RequestBody User user) {
		User u1 = userServices.saveUser(user);
		return u1.toString();
	}
	
	@GetMapping
	public List<User> getAllUsers() {
		return userServices.getAllUsers();
	}
	
	@DeleteMapping("/{id}")
	public boolean deleted(@PathVariable Long id) {
		return userServices.deleteUser(id);
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		return userServices.getUser(id);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		return userServices.updateUser(id, user);
	}
	
}
