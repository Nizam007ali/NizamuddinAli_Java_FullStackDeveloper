package com.web.main.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Page<Student> findAll(Pageable pageable);
	List<Student> findTop5ByOrderByPercentageDesc();
	List<Student> findTop5ByStudentClass_ClassNameOrderByPercentageDesc(String className);
	List<Student> findTop5ByStudentClass_ClassNameOrderBySub1Desc(String className);
	List<Student> findTop5ByStudentClass_ClassNameOrderBySub2Desc(String className);
	List<Student> findTop5ByStudentClass_ClassNameOrderBySub3Desc(String className);
	List<Student> findTop5ByStudentClass_ClassNameOrderBySub4Desc(String className);
	List<Student> findTop5ByStudentClass_ClassNameOrderBySub5Desc(String className);
}
