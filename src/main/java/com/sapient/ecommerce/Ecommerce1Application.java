package com.sapient.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = { "com.sapient.ecommerce.entity" })
@SpringBootApplication
public class Ecommerce1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ecommerce1Application.class, args);
	}

}
