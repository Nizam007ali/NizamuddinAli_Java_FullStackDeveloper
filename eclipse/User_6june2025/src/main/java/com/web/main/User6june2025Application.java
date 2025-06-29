package com.web.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.main.beans.User;
import com.web.main.dao.UserDAO;

@SpringBootApplication
public class User6june2025Application implements CommandLineRunner {
	
	@Autowired
	UserDAO userDao;

	public static void main(String[] args) {
		SpringApplication.run(User6june2025Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		com.web.main.beans.User user = new User();
		user.setEmail("nizam123");
		user.setPass("1234");

		boolean value = userDao.insert(user);
		if (value) {
			System.out.println("User inserted successfully!");
		} else {
			System.out.println("Failed to insert user.");
		}
	}

}
