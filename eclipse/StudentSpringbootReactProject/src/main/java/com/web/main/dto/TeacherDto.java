package com.web.main.dto;

import java.util.List;

import lombok.Data;

public class TeacherDto {
    private String name;
    private String email;
    private String subjects;
    private String classTeacherOf;
    private List<ClassSubjectInfo> teachingSubjects;
	
    @Data
    public static class ClassSubjectInfo {
        private String className;
        private String subject;

        public ClassSubjectInfo(String className, String subject) {
            this.className = className;
            this.subject = subject;
        }

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}
    }
    
	public TeacherDto() {
	}

	public TeacherDto(String name, String email, String subjects, String classTeacherOf,
			List<ClassSubjectInfo> teachingSubjects) {
		this.name = name;
		this.email = email;
		this.subjects = subjects;
		this.classTeacherOf = classTeacherOf;
		this.teachingSubjects = teachingSubjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public String getClassTeacherOf() {
		return classTeacherOf;
	}

	public void setClassTeacherOf(String classTeacherOf) {
		this.classTeacherOf = classTeacherOf;
	}

	public List<ClassSubjectInfo> getTeachingSubjects() {
		return teachingSubjects;
	}

	public void setTeachingSubjects(List<ClassSubjectInfo> teachingSubjects) {
		this.teachingSubjects = teachingSubjects;
	}
    
}
