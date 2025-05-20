package com.student.student_services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
	@Autowired
	private StudentRepository studentrepo;
	
	
	public List<Student> getAllStudents(){
		return studentrepo.findAll();
	}
	
	public List<Student> getStudentBySchoolId(int schoolId){
		return studentrepo.findBySchoolId(schoolId);
		
	}
	
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}
}
