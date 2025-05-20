package com.school.school_services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schools")
public class SchoolController {
	
	@Autowired
	SchoolService schoolservice;
	
	@GetMapping 
	public List<School> getAll(){
		return schoolservice.getAllschool();
	}
	
	@GetMapping("/{id}")
	public School getId(@PathVariable int id) {
		return schoolservice.getSchoolById(id);
		
	}
	
	@PostMapping
	public School save(@RequestBody School school) {
	  return  schoolservice.saveSchool(school);
	}
	
	@GetMapping("/{id}/{details}")
	public SchoolwithStudentResponse getSchoolDetails(@PathVariable int id) {
		return schoolservice.getSchoolWithStudents(id);
	}

}
