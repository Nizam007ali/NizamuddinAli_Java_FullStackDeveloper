package com.web.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.entity.Classes;
import com.web.main.repository.ClassesRepository;

@RestController
@RequestMapping("/classes")
@CrossOrigin(origins = "http://localhost:5173")
public class ClassesController {
	
	@Autowired
	private ClassesRepository classesRepository;
	
	@GetMapping
	public List<Classes> getClasses() {
		return classesRepository.findAll();
	}
	
	@GetMapping("/{className}")
	public Classes getClassbyClassname(@PathVariable String className) {
		return classesRepository.findByClassName(className);
	}
	
	
}
