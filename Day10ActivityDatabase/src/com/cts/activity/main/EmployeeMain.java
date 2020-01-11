package com.cts.activity.main;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;
import com.cts.activity.daoimpl.EmployeeDAOImpl;


public class EmployeeMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. Add Employee");
		System.out.println("2. Remove Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Display All Employees Details");
		System.out.println("5. Display Specific Employee Details");
		System.out.println("Enter the Operation you want to perform:");
		
		int ch=Integer.parseInt(sc.nextLine());
		
		Employee emp;
		EmployeeDAO employeeDAO=new EmployeeDAOImpl();
		
		switch(ch) {
		case 1:
			
		}
		
	}

}
