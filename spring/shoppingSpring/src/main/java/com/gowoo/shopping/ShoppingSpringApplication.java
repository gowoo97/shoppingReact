package com.gowoo.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication
public class ShoppingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingSpringApplication.class, args);
	}

}
