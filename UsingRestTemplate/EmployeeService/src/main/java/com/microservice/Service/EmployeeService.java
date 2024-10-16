package com.microservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.DAO.UserRepository;
import com.microservice.Entities.Employee;
import com.microservice.Response.AddressResponse;
import com.microservice.Response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public EmployeeResponse employeeService( int id)
	{
		
	   EmployeeResponse employeeResponse=new  EmployeeResponse(); //creating instance of EmployeerResponse
	   Employee employee=userRepo.findById(id); //getting employee object from database based on Id
	   
	   
	   
	   
	   //Making a Rest Call using RestTemplate
	   //this provides address data from AddressService
	    
	   AddressResponse adressResponse=restTemplate.getForObject("http://localhost:8088/address/{id}", AddressResponse.class , id);
	   
	   
	   //Mapping of Employee object to EmployeeResponse Object
	   employeeResponse.setBloodgroup(employee.getBloodgroup());
	   employeeResponse.setId(employee.getId());
	   employeeResponse.setName(employee.getName());
	   employeeResponse.setEmail(employee.getEmail());
	   employeeResponse.setAddressResponse(adressResponse);
	   
		
			return employeeResponse;
	}
	
	}


