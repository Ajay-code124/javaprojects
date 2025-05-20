package com.school.school_services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SchoolService {
	
	@Autowired
  private SchoolRepository schoolrepo;
	
	@Autowired 
	private RestTemplate restTemplate;
	
	
	
	
	public List<School> getAllschool(){
		return schoolrepo.findAll();
	}

	public School getSchoolById(int id){
		return schoolrepo.findById(id).orElse(null);
	}
	
	public School saveSchool(School school) {
		return schoolrepo.save(school);
	}
	
	public SchoolwithStudentResponse getSchoolWithStudents(int schoolId) {
		School school = getSchoolById(schoolId);
		
		List<Student> students = restTemplate.exchange("http://localhost:8087/students/schools/"+schoolId, 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {}).getBody();
		
		SchoolwithStudentResponse response = new SchoolwithStudentResponse();
		response.setSchool(school);
		response.setStudents(students);
		return response;
		
				
	}

}
