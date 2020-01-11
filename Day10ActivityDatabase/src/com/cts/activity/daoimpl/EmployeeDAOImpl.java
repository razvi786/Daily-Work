package com.cts.activity.daoimpl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	static Connection con=null;
	
	//Connect to database with try catch block
	static {
		
	}
	

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			
			String sql="";
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			list.remove(emp);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
//		for(Employee emp: list) {
//			if(emp.getId()== employee.getId()) {
//				list.set(list.indexOf(emp), employee);
//				return true;
//			}
//		}
		
		try {
			list.set(list.indexOf(getEmployeeById(employee.getId())),employee );
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		for(Employee emp: list) {
			if(emp.getId()==id)
				return emp;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

}
