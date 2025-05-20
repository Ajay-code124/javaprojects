package com.student.student_services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentser;
	
	
	@GetMapping
	public List<Student> getAll(){
		return studentser.getAllStudents();
	}
	
	@GetMapping("/schools/{schoolId}")
	public List<Student> getBySchoolId(@PathVariable int schoolId){
		
		return studentser.getStudentBySchoolId(schoolId);
		
	}
	@PostMapping
	public Student addValue(@RequestBody Student student) {
		return studentser.saveStudent(student);
	}
}
