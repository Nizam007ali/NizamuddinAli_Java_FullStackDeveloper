package com.web.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.main.Dao.UserDao;
import com.web.main.Entity.User;

@SpringBootApplication
public class User5june2025Application implements CommandLineRunner {

	@Autowired
	UserDao userDao;

	public static void main(String[] args) {
		System.out.println("Project Started!");
		SpringApplication.run(User5june2025Application.class, args);
		System.out.println("Project End!");
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setEmail("nizam123");
		user.setPass("1234");

		boolean value = userDao.insert(user);
		if (value) {
			System.out.println("User inserted successfully!");
		} else {
			System.out.println("Failed to insert user.");
		}
		
//		boolean value = userDao.update(user,user.getEmail());
//		if (value) {
//			System.out.println("User updated successfully!");
//		} else {
//			System.out.println("Failed to update user.");
//		}

//		boolean value = userDao.delete(user.getEmail());
//		if (value) {
//			System.out.println("User deleted successfully!");
//		} else {
//			System.out.println("Failed to delete user.");
//		}

		System.out.println("Run method executed!");
	}
}
