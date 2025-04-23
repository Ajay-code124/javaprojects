package com.example.RestApi.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	
	Map<String, Customer> allusers =new HashMap<>();
	
	
	@GetMapping
	public Collection<Customer> getdetails() {
		
		return allusers.values();
	}
	
	@PostMapping
	public String postmethod(@RequestBody Customer customer){
		Customer allValues =new Customer();
		allValues.setId(customer.getId());
		allValues.setName(customer.getName());
		allValues.setEmail(customer.getEmail());
		allusers.put(customer.getId(),allValues);
		return "User added successfuly";
		
	}
	@PutMapping(path="/{id}")
	public String postmethod(@PathVariable String id, Customer customer){
		if (allusers.containsKey(id)) {
		Customer allValues =new Customer();
		allValues.setId(customer.getId());
		allValues.setName(customer.getName());
		allValues.setEmail(customer.getEmail());
		allusers.put(id,allValues);
		
		return "Edit successfuly";
		}
		else {
			return "User id not found";
		}
		
	}
	
	@DeleteMapping(path="/{id}")
	public String deleteid(@PathVariable String id) {
		
		if (allusers.containsKey(id)) {
			
			allusers.remove(id);
			
			return "Deleted Successfully";
		}
		else {
			return "Userid not found";
		}
	}
}
