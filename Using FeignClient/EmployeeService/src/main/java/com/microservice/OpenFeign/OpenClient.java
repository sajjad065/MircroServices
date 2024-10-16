package com.microservice.OpenFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.Response.AddressResponse;

//This interface acts as a Feign client to interact with the external service.
//The following interface's implementation is provided by the Spring framework
//url is defined to call AddressSrvice (service running in another server) 

@FeignClient(name="feignclient" , url="http://localhost:8088/")
public interface OpenClient {
	
	// This method fetches an AddressResponse from the external service using the specified ID.
    // It makes a GET request to the /address/{id} endpoint.
	@GetMapping("/address/{id}")
	public AddressResponse getAddress(@PathVariable("id") int id);

}
