package com.addressservice.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressservice.DAO.AddressRepository;
import com.addressservice.Entities.Address;
import com.addressservice.Response.AddressResponse;

//This class makes call to the database and return AddressResponse object to the controller class
//Here we fetch the Address data based on the Id from database and convert Address object to AddressResponse Object


@Service
public class AddressService {

	
	@Autowired
	private  AddressRepository addRepo;
	
	public AddressResponse addressService(int id)
	
	{
		
	AddressResponse addressResponse=new AddressResponse(); //creating instance of AddressResponse
	Address  address=addRepo.findAddressId(id); //making call to database  using Repository interface.
	
	
	//mapping all Address object to AddressResponse
	//can use ModelMapper for shortening the code as well
	addressResponse.setAddress_id(address.getAddress_id());
	addressResponse.setState(address.getState());
	addressResponse.setStreet(address.getStreet());
	addressResponse.setZipcode(address.getZipcode());
	
	
	return addressResponse;
	
	}
}
