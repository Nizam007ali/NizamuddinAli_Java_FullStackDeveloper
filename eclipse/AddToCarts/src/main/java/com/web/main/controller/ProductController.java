package com.web.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.entity.Product;
import com.web.main.repository.ProductRepository;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/allProduct")
	public List<Product> allProduct() {
		return productRepository.findAll();
	}

	@GetMapping("/getProducts")
	public org.springframework.data.domain.Page<Product> getProducts(
	    @RequestParam(defaultValue = "0") int page,
	    @RequestParam(defaultValue = "5") int size,
	    @RequestParam(defaultValue = "serial_id") String sortBy,
	    @RequestParam(defaultValue = "asc") String direction
	) {
	    try {
	        Sort sort = direction.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
	        Pageable pageable = PageRequest.of(page, size, sort);
	        return productRepository.findAll(pageable);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
}
