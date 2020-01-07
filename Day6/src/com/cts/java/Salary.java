package com.cts.java;

import java.util.Scanner;

public class Salary extends Employee {
	
	Scanner sc=new Scanner(System.in);
	
	double basicPay;
	double da;
	double hra;
	double grossPay;
	double pf;
	double incomeTax;
	double netPay;
	
	public void getData1() {
		getData();
		System.out.println("Enter Basic Pay: ");
		basicPay=sc.nextDouble();
	}
	
	public void calculate() {
		
		da=(basicPay/100)*30;
		hra=(basicPay/100)*30;
		grossPay=basicPay+da+hra;
		pf=(grossPay/100)*12;
		incomeTax=(grossPay/100)*18;
		netPay=grossPay-incomeTax-pf;
	}
	
	public void display() {
		putData();
		System.out.println("Basic Pay: "+basicPay);
		System.out.println("DA(30%): "+da);
		System.out.println("HRA(30%): "+hra);
		System.out.println("Gross Pay: "+grossPay);
		System.out.println("Provident Fund(12%): "+pf);
		System.out.println("Income Tax(20%): "+incomeTax);
		System.out.println("Net Pay: "+netPay);
		System.out.println();
	}

}
