package com.web.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.web.main.entity.User;
import com.web.main.service.UserMethodImpl;

@SpringBootApplication
public class JpaUserProject12062025Application {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(JpaUserProject12062025Application.class, args);
		
		UserMethodImpl userMethodImpl = context.getBean(UserMethodImpl.class);
		
//		User user = new User();
//		user.setId(3);
//		user.setEmail("shorava");
//		user.setPass("shu123");
		
//		if(userMethodImpl.insert(user)) {
//			System.out.println("User inserted successfully");
//		} else {
//			System.out.println("User insertion failed");
//		}
		
		List<User> users = userMethodImpl.getAllUsers();
		for (User user : users) {
			System.out.println("ID: " + user.getId() + ", Email: " + user.getEmail() + ", Password: " + user.getPass());
		}
		
	}

}
