package com.terry.logging;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOrderApplication.class, args);
	}	
}

@RestController
class ServiceA{
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	private static final Logger log = Logger.getLogger(ServiceA.class.getName());
	
	@GetMapping(value="/servicea")
	public String getOrders() {
		log.info("Inside service A");
		return "hello service A";
	}
	
}
