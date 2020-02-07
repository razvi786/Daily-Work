package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.Person;

public class PersonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("collections.xml");
		
		Person p=(Person)context.getBean("person");
		
		System.out.println(p);

	}

}
