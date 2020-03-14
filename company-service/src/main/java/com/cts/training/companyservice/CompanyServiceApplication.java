package com.cts.training.companyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.training.companyservice.repo.CompanyRepo;

@SpringBootApplication(scanBasePackages = "com.cts.training.companyservice")
@EnableDiscoveryClient
public class CompanyServiceApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CompanyServiceApplication.class, args);
		ConfigurableApplicationContext c=SpringApplication.run(CompanyServiceApplication.class, args);
		CompanyRepo companyRepoBean=c.getBean(CompanyRepo.class);
		System.out.println(companyRepoBean.findListedInByName("APPLE"));
	}

}
