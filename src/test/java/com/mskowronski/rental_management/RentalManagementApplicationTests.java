package com.mskowronski.rental_management;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RentalManagementApplicationTests {

	@Test
	void contextLoads() {
	}

}
