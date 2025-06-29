
package com.web.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.entity.Classes;


public interface ClassesRepository extends JpaRepository<Classes, String> {
	Classes findByClassName(String className);
}

