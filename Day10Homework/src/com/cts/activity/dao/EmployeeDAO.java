package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.Employee;

public interface EmployeeDAO {

	public boolean insertEmployee(Employee emp);
	
	public boolean deleteEmployee(int id);
	
	public boolean updateEmployee(Employee emp);
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> getAllEmployees();
	
}
