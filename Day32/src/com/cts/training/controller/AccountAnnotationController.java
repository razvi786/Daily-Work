package com.cts.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.model.AccountEntity;

public class AccountAnnotationController {

	public static void main(String[] args) {

//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		
		AccountEntity account=(AccountEntity)context.getBean("accountEntity");
		account.setBalance(1000.5467);
		System.out.println(account.getBalance());
		
		ArrayList<Integer> withdrawls=new ArrayList<Integer>();
		withdrawls.add(123);
		withdrawls.add(345);
		withdrawls.add(346);
		withdrawls.add(123);
		
		account.setWithdrawals(withdrawls);
		System.out.println(account.getWithdrawals());
	}

}
