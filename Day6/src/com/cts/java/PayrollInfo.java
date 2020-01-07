package com.cts.java;

import java.util.Scanner;

public class PayrollInfo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Salary emp[];
		int n=0;
		System.out.println("Enter Number of Employee: ");
		n=sc.nextInt();
		
		emp=new Salary[n];
				
		for(int i=0;i<n;i++) {
			emp[i]=new Salary();
			emp[i].getData1();
			emp[i].calculate();
			emp[i].display();
		}
		
	}

}
