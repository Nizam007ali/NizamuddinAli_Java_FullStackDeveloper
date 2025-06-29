package com.web.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.entity.User;

@CrossOrigin("http://localhost:5173")
@RestController
public class UserController {

	@PostMapping("/user")
	public String setUser(@RequestBody User user) {
		
		return "hello";
	}
	
}
