package com.cts.training.stockpriceservice;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.beans.BeansEndpoint.ContextBeans;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.training.stockpriceservice.repo.StockPriceRepo;

@SpringBootApplication(scanBasePackages = "com.cts.training.stockpriceservice")
@EnableDiscoveryClient
public class StockPriceServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(StockPriceServiceApplication.class, args);
		StockPriceRepo repoBean=c.getBean(StockPriceRepo.class);
//		System.out.println(repoBean.getCompanyPricesByCode(500112));
//		System.out.println("All Stock Prices: "+repoBean.getCompanyPricesByCode("500112"));
	}

}
