package com.bernardo.webserviceCustomers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebserviceCustomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceCustomersApplication.class, args);
	}

}
