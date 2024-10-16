package com.addressservice.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//This is a Entity class that is mapped with the database table named "address"
//each field is binded with the table's column in mapped database.

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="address_id")
	private int address_id;
	
	@Column(name="street")
	private String street;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zipcode")
	private int zipcode;
	
	//generating getters and setters
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
		return "Address [address_id=" + address_id + ", street=" + street + ", state=" + state + ", zipcode=" + zipcode
				+ "]";
	}
	

}
