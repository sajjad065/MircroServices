package com.microservice.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.Entities.Employee;

@Repository
public interface UserRepository extends JpaRepository <Employee, Integer> {
	
	//This method will return the Employee object based on it's id from database
	//Spring will provide  the implementation and return Employee Object
	public Employee findById(int id);
	

}
