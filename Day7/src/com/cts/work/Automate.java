package com.cts.work;

import java.util.Scanner;

public class Automate {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Who Are You?");
		System.out.println("1. Employee");
		System.out.println("2. Student");
		System.out.print("Enter Your Choice(1/2): ");
		ch=Integer.parseInt(sc.nextLine());
		switch(ch) {
			case 1:
				Employee e1=new Employee();
				e1.getData();
				System.out.println("-----EMPLOYEE INFORMATION-----");
				e1.display();
				break;
				
			case 2:
				Student s1=new Student();
				s1.getData();
				System.out.println("-----STUDENT INFORMATION-----");
				s1.display();
				break;
				
			default:
				System.out.println("Enter Correct Option");
		}
	}

}

class University{
	
	 private int id;
	 private String fname;
	 private String lname;
	 private int age;
	
	 protected void getData() {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter ID: ");
		 id=Integer.parseInt(sc.nextLine());
		 System.out.print("Enter First Name: ");
		 fname=sc.nextLine();
		 System.out.print("Enter Last Name: ");
		 lname=sc.nextLine();
		 System.out.print("Enter Age: ");
		 age=Integer.parseInt(sc.nextLine());
	 }
	 
	 protected void display() {
		 System.out.println("Id: "+id);
		 System.out.println("First Name: "+fname);
		 System.out.println("Last Name: "+lname);
		 System.out.println("Age: "+age);
	 }
}

class Student extends University{
	
	private String course;
	
	protected void getData() {
		super.getData();
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Course: ");
		 course=sc.nextLine();
	}
	
	protected void display() {
		super.display();
		System.out.println("Course: "+course);
	}
	
}

class Employee extends University{
	
	private int sal;
	private String dname;
	private String desig;
	
	protected void getData() {
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary: ");
		sal=Integer.parseInt(sc.nextLine());
		 System.out.print("Enter dname: ");
		 dname=sc.nextLine();
		 System.out.print("Enter Designation: ");
		 desig=sc.nextLine();
	}
	
	protected void display() {
		super.display();
		System.out.println("Salary: "+sal);
		System.out.println("Department Name: "+dname);
		System.out.println("Designation: "+desig);
	}
	
}