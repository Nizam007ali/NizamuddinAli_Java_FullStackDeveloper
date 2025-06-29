package com.web.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.dto.SubjectwiseTopperDto;
import com.web.main.entity.Student;
import com.web.main.repository.StudentRepository;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping
	public Page<Student> getStudents(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "10") int size) {
		Pageable pageable = PageRequest.of(page, size);
		return studentRepository.findAll(pageable);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	@PostMapping("/student/add")
	public Student getStudent(@RequestBody Student student) {
		if(student.getSub1() < 0 || student.getSub2() < 0 || student.getSub3() < 0 || student.getSub4() < 0 || student.getSub5() < 0 ||
		student.getSub1() > 100 || student.getSub2() > 100 || student.getSub3() > 100 || student.getSub4() > 100 || student.getSub5() > 100) {
			return null;
		}
		student.calculateTotal();
		student.calculatePercentage();
		student.calculateGrade();
		return studentRepository.save(student);
	}
	
	@PutMapping("/student/update/{id}")
	public Student getStudent(@RequestBody Student student, @PathVariable Long id) {
		if(student.getSub1() < 0 || student.getSub2() < 0 || student.getSub3() < 0 || student.getSub4() < 0 || student.getSub5() < 0 ||
		student.getSub1() > 100 || student.getSub2() > 100 || student.getSub3() > 100 || student.getSub4() > 100 || student.getSub5() > 100) {
			return null;
		}
		Student existingStudent = studentRepository.findById(id).orElse(null);
		if (existingStudent == null) {
			return null; 
		}
		existingStudent.setName(student.getName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPassword(student.getPassword());
		existingStudent.setStudentClass(student.getStudentClass());
		existingStudent.setSub1(student.getSub1());
		existingStudent.setSub2(student.getSub2());
		existingStudent.setSub3(student.getSub3());
		existingStudent.setSub4(student.getSub4());
		existingStudent.setSub5(student.getSub5());
		existingStudent.calculateTotal();
		existingStudent.calculatePercentage();
		existingStudent.calculateGrade();
		return studentRepository.save(existingStudent);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public Student deleteStudent(@PathVariable Long id) {
		Student student = studentRepository.findById(id).orElse(null);
		if (student != null) {
			studentRepository.delete(student);
		}
		return student;
	}
	
	@GetMapping("/top5")
	public List<Student> getTop5Students() {
		return studentRepository.findTop5ByOrderByPercentageDesc();
	}
	
	@GetMapping("/top5/{class_name}")
	public List<Student> getTop3StudentsByClass(@PathVariable String class_name) {
		return studentRepository.findTop5ByStudentClass_ClassNameOrderByPercentageDesc(class_name);
	}
	
	@GetMapping("/top5/{class_name}/subjects")
	public List<SubjectwiseTopperDto> getTop5StudentsBySub(@PathVariable String class_name) {
		List<Student> l1 = studentRepository.findTop5ByStudentClass_ClassNameOrderBySub1Desc(class_name);
		List<Student> l2 = studentRepository.findTop5ByStudentClass_ClassNameOrderBySub2Desc(class_name);
		List<Student> l3 = studentRepository.findTop5ByStudentClass_ClassNameOrderBySub3Desc(class_name);
		List<Student> l4 = studentRepository.findTop5ByStudentClass_ClassNameOrderBySub4Desc(class_name);
		List<Student> l5 = studentRepository.findTop5ByStudentClass_ClassNameOrderBySub5Desc(class_name);
		List<SubjectwiseTopperDto> result = new ArrayList<>();
		for (int i=0; i<l1.size(); i++) {
			SubjectwiseTopperDto row = new SubjectwiseTopperDto();
	        row.setSub1(i < l1.size() ? l1.get(i).getName() + " - " + l1.get(i).getSub1() : "-");
	        row.setSub2(i < l2.size() ? l2.get(i).getName() + " - " + l2.get(i).getSub2() : "-");
	        row.setSub3(i < l3.size() ? l3.get(i).getName() + " - " + l3.get(i).getSub3() : "-");
	        row.setSub4(i < l4.size() ? l4.get(i).getName() + " - " + l4.get(i).getSub4() : "-");
	        row.setSub5(i < l5.size() ? l5.get(i).getName() + " - " + l5.get(i).getSub5() : "-");
	        result.add(row);
		}
		return result;
	}
	
}
