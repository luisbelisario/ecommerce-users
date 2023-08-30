package com.belisario.ecommerceusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcommerceUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceUsersApplication.class, args);
	}

}
