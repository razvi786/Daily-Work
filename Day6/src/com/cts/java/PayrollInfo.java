//Payroll information system:
//    Declare the base class 'employee' with employee's number, name, designation, address, phone number.
//    Define and declare the function getdata() and putdata() to get the employee's details and print employee's details.
//    Declare the derived class salary with basic pay, DA, HRA, Gross pay, PF, Income tax and Net pay. 
//    Declare and define the function getdata1() to call getdata() and get the basic pay,
//    Define the function calculate() to find the net pay.
//    Define the function display() to call putdata() and display salary details .
//    Create the derived class object.
//    Read the number of employees.
//    Call the function getdata1() and calculate() to each employees. 
//    Call the display() function.


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
