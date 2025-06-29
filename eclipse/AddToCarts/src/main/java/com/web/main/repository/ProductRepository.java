package com.web.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
