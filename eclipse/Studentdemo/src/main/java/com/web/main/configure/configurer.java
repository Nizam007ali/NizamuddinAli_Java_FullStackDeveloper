package com.web.main.configure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.web.main.beans.StudentBeans;

@Configuration
public class configurer {
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				student().setName("nizam");
				student().setRoll(101);
				student().display(); 
			}
		};
	}
	
	@Bean
	public StudentBeans student() {
		return new StudentBeans();
	}
}
