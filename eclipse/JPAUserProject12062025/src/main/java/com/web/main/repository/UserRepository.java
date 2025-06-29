package com.web.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
