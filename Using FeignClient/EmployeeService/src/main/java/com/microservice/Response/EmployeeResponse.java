package com.microservice.Response;

//This is a EmployeeResponse class. It is not a good approach to directly return Employee Object so we creted EmployeeResponse  class
//This class will have all the field and methods of Employee class
//Here we have added on extra field that is of AddressResponse class type
//AddressResponse will provide us the address of the employee by making a Rest Call to Address Service

public class EmployeeResponse {
	
	
	private int id;
	
	private String name;
	
	
	private String email;
	
	
	private String bloodgroup;
	
	private AddressResponse addressResponse;


	public AddressResponse getAddressResponse() {
		return addressResponse;
	}


	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}


	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	
	
	

}
