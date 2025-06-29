package com.web.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.main.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
