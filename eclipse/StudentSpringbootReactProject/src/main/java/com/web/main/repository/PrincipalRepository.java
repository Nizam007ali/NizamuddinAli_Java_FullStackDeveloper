package com.web.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.entity.Principals;

public interface PrincipalRepository extends JpaRepository<Principals, Long> {

}
