package com.web.main.repoitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
