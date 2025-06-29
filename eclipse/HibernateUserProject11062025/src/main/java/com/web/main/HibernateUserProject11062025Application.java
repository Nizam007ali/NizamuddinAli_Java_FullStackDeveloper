package com.web.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.main.entity.User;

@SpringBootApplication
public class HibernateUserProject11062025Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateUserProject11062025Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(com.web.main.entity.User.class)
				.buildSessionFactory();
	
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			
			// Example of creating a new user
			User user = new User();
			user.setEmail("nitish");
			user.setPass("0000");
			
			session.save(user);
			
			session.getTransaction().commit();
			System.out.println("✅ User saved successfully: "+user.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
 	}
}
