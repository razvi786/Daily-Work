package com.cts.oops;

import java.util.Scanner;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager emp=new Manager();
		emp.getData2();
		emp.display2();
	}

}


class Employee{
	int id;
	String name;
	String company;
	
	public void display() {
		System.out.println();
		System.out.println("-----EMPLOYEE INFORMATION-----");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
	}
	
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id: ");
		id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Name: ");
		name=sc.nextLine();
		System.out.print("Enter Company: ");
		company=sc.nextLine();
	}
}

class Manager extends Employee{
	
	String[] team;
	String department;
	
	public void getData2() {
		getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Department: ");
		department=sc.nextLine();
		System.out.print("Enter No. of team members: ");
		int n=Integer.parseInt(sc.nextLine());
		team=new String[n];
		System.out.println("Enter "+n+" Team Members Below");
		for(int i=0;i<team.length;i++) {
			System.out.print("Member-"+i+": ");
			team[i]=sc.nextLine();
		}
	}
	
	public void display2() {
		display();
		System.out.println("Department: "+department);
		System.out.print("Team Members: ");
		for(int i=0;i<team.length;i++) {
			System.out.print(team[i]+" ");
		}
	}
	
	
}

class Developer extends Employee{
	
	String domain;
	String projectName;
	String duration;
	
	public void display3() {
		display();
		System.out.println("Domain: "+domain);
		System.out.println("Project Name: "+projectName);
		System.out.println("Duration: "+duration);
	}
	
	public void getData3() {
		getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Domain: ");
		domain=sc.nextLine();
		System.out.print("Enter Project Name: ");
		projectName=sc.nextLine();
		System.out.print("Enter Duration: ");
		duration=sc.nextLine();
		
	}
	
}