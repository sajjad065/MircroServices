package com.microservice.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.DAO.UserRepository;
import com.microservice.Entities.Employee;
import com.microservice.Response.EmployeeResponse;
import com.microservice.Service.EmployeeService;

//This class is a controller class that will be responsible to handle the rest call or endpoints.
//it is mapped with "/employee/{id}" enpoint that will receive id from the url
//it return Employee details along with its address
//address will be provided by another service (AddressService) running in different server.
// ResponseEntity of type EmployeeResponse is returned here as it is not a good idea to directly return Employee object
//Call is made to EmployeeService class that handles the call to database and call to AddressService


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	
	@GetMapping("/employee/{id}")
	public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable("id") int id)
	{
		EmployeeResponse employeeResponse=employeeService.employeeService(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}
	

}

