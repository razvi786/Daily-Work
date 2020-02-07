package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.CustomerEntity;
import com.cts.training.model.FundTransferEntity;
import com.cts.training.model.ICHD;


public class ICHDController {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("namespace.xml");
		
//		CustomerEntity customer1=(CustomerEntity)context.getBean("customer1");

//		CustomerEntity customer2=(CustomerEntity)context.getBean("customer2");
		
		CustomerEntity customer=(CustomerEntity)context.getBean("customer");

		ICHD bank=new ICHD();
		bank.viewAccDetails(customer);
		
//		FundTransferEntity fe=(FundTransferEntity)context.getBean("fund1");
		
//		bank.transferFunds(fe);

	}

}
