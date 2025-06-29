package com.web.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.Entity.Product;
import com.web.main.repoitory.ProductRepository;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@PostMapping("/addProduct")
	public boolean addProduct(@RequestBody Product product) {
		try {
			productRepository.save(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		try {
			return productRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/getProducts")
	public org.springframework.data.domain.Page<Product> getProducts(
	    @RequestParam(defaultValue = "0") int page,
	    @RequestParam(defaultValue = "4") int size,
	    @RequestParam(defaultValue = "id") String sortBy,
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
