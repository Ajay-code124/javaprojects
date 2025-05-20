package com.school.school_services;

import java.util.List;

public class SchoolwithStudentResponse {
	private School school;
	private List<Student> students;
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	

}
