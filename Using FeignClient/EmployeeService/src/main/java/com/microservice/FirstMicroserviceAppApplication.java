package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.microservice.OpenFeign")
public class FirstMicroserviceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroserviceAppApplication.class, args);
	}

}
