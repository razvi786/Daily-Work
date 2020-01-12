package com.cts.activity.main;

import java.util.List;
import java.util.Scanner;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;
import com.cts.activity.daoimpl.EmployeeDAOImpl;

public class EmployeeMain {
	
	public void insert(EmployeeDAO empDAO) {
		
		//Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Address: ");
		String address=sc.nextLine();
		System.out.print("Enter Age: ");		
		int age=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Phone: ");
		long phone=Long.parseLong(sc.nextLine());
		System.out.print("Enter Salary: ");
		double salary=Double.parseDouble(sc.nextLine());
		
		Employee emp=new Employee(id,name,address,age,phone,salary);
		
		if(empDAO.insertEmployee(emp)) {
			System.out.println("\tEMPLOYEE "+id+" DETAILS");
			System.out.println(emp);
			System.out.println("Employee "+id+" Inserted");
		}
		else
			System.out.println("Employee Not Inserted.");
		
	}
	
	public void delete(EmployeeDAO empDAO) {
		
		//Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID to Delete: ");
		int id=Integer.parseInt(sc.nextLine());
		
		if(empDAO.deleteEmployee(id))
			System.out.println("Employee "+id+" Deleted.");
		else
			System.out.println("Employee Not Deleted.");
		
	}
	
	public void update(EmployeeDAO empDAO) {
		
		//Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int id=Integer.parseInt(sc.nextLine());
		Employee emp=empDAO.getEmployeeById(id);
		Employee emp2=emp;
		System.out.println("\tEMPLOYEE "+id+" DETAILS");
		System.out.println(emp);
		System.out.print("1. ID    ");
		System.out.print("2. Name    ");
		System.out.print("3. Address    ");
		System.out.print("4. Age    ");
		System.out.print("5. Phone    ");
		System.out.print("6. Salary    ");
		System.out.println("7. Exit");
		System.out.print("Select Field to Update: ");
		
		
		int ch;
		int id2;
		try {
			ch = Integer.parseInt(sc.nextLine());
			id2 = id;
			
			switch(ch) {
			case 1:
				System.out.print("Enter New ID: ");
				id2=Integer.parseInt(sc.nextLine());
				emp.setId(id2);
				break;
			case 2:
				System.out.print("Enter New Name: ");
				String name=sc.nextLine();
				emp.setName(name);
				break;
			case 3:
				System.out.print("Enter New Address: ");
				String address=sc.nextLine();
				emp.setAddress(address);
				break;
			case 4:
				System.out.print("Enter New Age:");
				int age=Integer.parseInt(sc.nextLine());
				emp.setAge(age);
				break;
			case 5:
				System.out.print("Enter New Phone Number: ");
				long phone=Long.parseLong(sc.nextLine());
				emp.setPhone(phone);
				break;
			case 6:
				System.out.print("Enter New Salary: ");
				double salary=Double.parseDouble(sc.nextLine());
				emp.setSalary(salary);
				break;
			case 7:
				ch=7;
				break;
			default:
				System.out.println("Invalid Choice.");
				ch=7;
			}
		
		
		if (ch != 7) {
			if (empDAO.updateEmployee(emp)) {
				System.out.println("\tEMPLOYEE " + id2 + " DETAILS");
				System.out.println(empDAO.getEmployeeById(id2));
				System.out.println("Employee " + id2 + " Updated.");
			} else {
				System.out.println("Employee Not Updated");
			}
		}else {
			System.out.println("Employee Not Updated");
		}
		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
		}
	}

	public void display(EmployeeDAO empDAO) {
		
		//Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID to Display: ");
		int id=Integer.parseInt(sc.nextLine());
		
		Employee emp=empDAO.getEmployeeById(id);
		
		if(emp==null) {
			System.out.println("Employee "+id+" Not Found.");
		}else {
			System.out.println("\tEMPLOYEE "+id+" DETAILS");
			System.out.println(emp);
		}
		
	}
	
	public void displayAll(EmployeeDAO empDAO) {
		
		List<Employee> list=empDAO.getAllEmployees();
		
		if(list==null) {
			System.out.println("Table is Empty.");
		}else {
			System.out.println("\tALL EMPLOYEE DETAILS");
			for(Employee emp:list) {
				System.out.println(emp);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO empDAO=new EmployeeDAOImpl();
		EmployeeMain empMain=new EmployeeMain();
		Scanner sc = new Scanner(System.in);
		
		int ch=0;
		try {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("\t\tWELCOME TO EMPLOYEE PORTAL\t\t");
			do {
				
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("1. Insert Employee");
				System.out.println("2. Delete Employee");
				System.out.println("3. Update Employee");
				System.out.println("4. Display Employee By ID");
				System.out.println("5. Display All Employees");
				System.out.println("6. Exit");
				System.out.print("Enter Your Choice: ");
				ch=Integer.parseInt(sc.nextLine());
				System.out.println("------------------------------------------------------------------------------");
				
				switch(ch) {
				case 1:
					empMain.insert(empDAO);
					break;
				case 2:
					empMain.delete(empDAO);
					break;
				case 3:
					empMain.update(empDAO);
					break;
				case 4:
					empMain.display(empDAO);
					break;
				case 5:
					empMain.displayAll(empDAO);
					break;
				case 6:
					System.out.println("Thank You for Using Employee Portal");
					break;
				default:
					System.out.println("Invalid Choice");	
				}
			}while(ch!=6);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
		}
		
	}

}
