package com.web.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.dto.TeacherDto;
import com.web.main.dto.TeacherDto.ClassSubjectInfo;
import com.web.main.entity.Classes;
import com.web.main.entity.Teacher;
import com.web.main.repository.ClassesRepository;
import com.web.main.repository.TeacherRepository;

@RestController
@RequestMapping("/teachers")
@CrossOrigin(origins = "http://localhost:5173")
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;
	@Autowired
	private ClassesRepository classesRepository;
	
//	@GetMapping
//	public List<Teacher> getTeachers() {
//		return teacherRepository.findAll();
//	}
	
	@GetMapping
	public List<TeacherDto> getAllTeacherDetails() {
	    List<Teacher> teachers = teacherRepository.findAll();
	    List<Classes> classes = classesRepository.findAll();

	    List<TeacherDto> result = new ArrayList<>();

	    for (Teacher t : teachers) {
	        TeacherDto dto = new TeacherDto();
	        dto.setName(t.getName());
	        dto.setEmail(t.getEmail());
	        dto.setSubjects(t.getSubjects());

	        List<TeacherDto.ClassSubjectInfo> teachingList = new ArrayList<>();
	        for (Classes c : classes) {
	            if (c.getClassTeacher().equals(t.getName())) {
	                dto.setClassTeacherOf(c.getClassName());
	            }

	            if (c.getSub1teacher().equals(t.getName()))
	                teachingList.add(new ClassSubjectInfo(c.getClassName(), c.getSub1name()));
	            if (c.getSub2teacher().equals(t.getName()))
	                teachingList.add(new ClassSubjectInfo(c.getClassName(), c.getSub2name()));
	            if (c.getSub3teacher().equals(t.getName()))
	                teachingList.add(new ClassSubjectInfo(c.getClassName(), c.getSub3name()));
	            if (c.getSub4teacher().equals(t.getName()))
	                teachingList.add(new ClassSubjectInfo(c.getClassName(), c.getSub4name()));
	            if (c.getSub5teacher().equals(t.getName()))
	                teachingList.add(new ClassSubjectInfo(c.getClassName(), c.getSub5name()));
	        }

	        dto.setTeachingSubjects(teachingList);
	        result.add(dto);
	    }

	    return result;
	}

	
}
