package com.microservice.Response;

//Basically this is a class that we copied it from Address service
//We are calling AddressService (service that is in different Server) from EmployeeService so we need to fetch the data from AddressService
//it has all the related field to serve the Employee with the address 

public class AddressResponse {
	
	
    private int address_id;
	
	private String street;
	
	
	private String state;
	
	
	private int zipcode;


	public int getAddress_id() {
		return address_id;
	}


	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "AddressResponse [address_id=" + address_id + ", street=" + street + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}
	
	
	

}
