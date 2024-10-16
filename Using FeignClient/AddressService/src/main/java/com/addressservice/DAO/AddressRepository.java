package com.addressservice.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.addressservice.Entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	
	//This method will return address of the user based on the user id
	@Query(value="SELECT address_id, street, state, zipcode FROM FirstMicroService.address WHERE id=:id;",nativeQuery = true)
	public Address findAddressId(@Param("id")int id);

}
