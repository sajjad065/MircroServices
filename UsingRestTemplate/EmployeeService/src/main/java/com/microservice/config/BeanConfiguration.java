package com.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

// This is a component class that defines a RestTemplate bean, which will be created and managed by the Spring container.



@Component
public class BeanConfiguration {
	
	
	@Bean
	RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
