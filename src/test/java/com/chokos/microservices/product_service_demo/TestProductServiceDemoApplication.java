package com.chokos.microservices.product_service_demo;

import org.springframework.boot.SpringApplication;

public class TestProductServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServiceDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
