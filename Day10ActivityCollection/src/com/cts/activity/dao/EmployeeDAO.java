package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.Employee;

public interface EmployeeDAO {
	
	public boolean addEmployee(Employee emp);
	
	public boolean updateEmployee(Employee emp);
	
	public boolean deleteEmployee(Employee emp);
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> getAllEmployees(); 

}
