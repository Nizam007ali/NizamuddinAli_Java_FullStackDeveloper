package com.web.main.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/demo")
	public String demo(Model model) {
		
		model.addAttribute("username", "Nizam");
		model.addAttribute("isAdmin", true);
		
		List<String> itemList = List.of("Laptop", "Mobile", "Tablet");
		model.addAttribute("items", itemList);
		
		return "demoview";
	}
	
}
