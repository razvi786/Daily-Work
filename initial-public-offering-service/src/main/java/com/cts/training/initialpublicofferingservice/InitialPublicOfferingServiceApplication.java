package com.cts.training.initialpublicofferingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.cts.training.initialpublicofferingservice")
@EnableDiscoveryClient
public class InitialPublicOfferingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialPublicOfferingServiceApplication.class, args);
	}

}
