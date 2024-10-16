package com.addressservice.Response;

//This class is a photocopy class of Address class
//here we have defined all the fields and methods as in Address class
//This class is used for sending the response when a call is made to the endpoints
//AddressResponse object is sent as a response for any Rest call 


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
	
	
	

}
