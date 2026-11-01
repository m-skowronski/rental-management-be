package com.mskowronski.rental_management;

import org.springframework.boot.SpringApplication;

public class TestRentalManagementApplication {

	static void main(String[] args) {
		SpringApplication.from(RentalManagementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
