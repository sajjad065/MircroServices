package com.addressservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.addressservice.DAO.AddressRepository;
import com.addressservice.Entities.Address;
import com.addressservice.Response.AddressResponse;
import com.addressservice.Service.AddressService;


//This is controller class that handles the request made with endpoint "/address/{id}"
//In this class,  call is made to AddressService class where all the database call is made
//We are returning the AddressResponse object here in the form of ResponseEntity
//getAddress() will capture the value of "id" from the url

@RestController
public class AddressController {
	
	@Autowired
	AddressService  addressService;
	
	@GetMapping("/address/{id}")
	public ResponseEntity<AddressResponse> getAddress(@PathVariable("id") int id )
	{
		
		AddressResponse addressResponse=addressService.addressService(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}

}
 