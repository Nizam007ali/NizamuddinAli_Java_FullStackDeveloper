package com.web.main.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	Page<Teacher> findAll(Pageable pageable);
}
