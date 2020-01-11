package com.cts.activity.main;

import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;
import com.cts.activity.daoimpl.EmployeeDAOImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO employeeDAO=new EmployeeDAOImpl();
		List<Employee> list;
		
		//Get Element By ID
		Employee emp=employeeDAO.getEmployeeById(101);
		System.out.println(emp);
		System.out.println();
		
		//Add Employee
		emp=new Employee(103, "Hello", "Chennai", 102, 654321, 124000);
		if(employeeDAO.addEmployee(emp))
			System.out.println("Employee added");
		else
			System.out.println("Employee Not Added");
		
		//Displaying List
		list= employeeDAO.getAllEmployees();
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println();
		
		//Delete employee
		emp=employeeDAO.getEmployeeById(103);
		if(employeeDAO.deleteEmployee(emp))
			System.out.println("Employee Removed");
		else
			System.out.println("Employee Not Removed");
		
		//display all employees
		list=employeeDAO.getAllEmployees();
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println();
		
		//updating employee
		emp=employeeDAO.getEmployeeById(102);
		emp.setAddress("Borbanda");

		if(employeeDAO.updateEmployee(emp))
			System.out.println("Employee Updated");
		else
			System.out.println("Employee Not Updated");
		
		//display all employees
		list=employeeDAO.getAllEmployees();
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println();

	}

}
