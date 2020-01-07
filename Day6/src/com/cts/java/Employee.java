package com.cts.java;

import java.util.Scanner;

public class Employee {
	
	Scanner sc=new Scanner(System.in);
	
	int eno;
	String name;
	String desig;
	String address;
	long pno;
	public void getData() {
		System.out.println("Enter Employee No: ");
		this.eno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name: ");
		this.name=sc.nextLine();
		System.out.println("Enter Designation: ");
		this.desig=sc.nextLine();
		System.out.println("Enter  Address:");
		this.address=sc.nextLine();
		System.out.println("Enter Phone Number: ");
		this.pno=sc.nextLong();
	}
	public void putData() {
		System.out.println();
		System.out.println("-----EMPLOYEE INFORMATION-----");
		System.out.println("Employee No: "+eno);
		System.out.println("Name: "+name);
		System.out.println("Designation: "+desig);
		System.out.println("Address: "+address);
		System.out.println("Phone Number: "+pno);
	}

}
