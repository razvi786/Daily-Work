package com.cts.activity.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	static Connection con=null;
	
	static {
		
		try {
			
			//establishing database connection
			Class.forName("com.mysql.jdbc.Driver");
			
//			String url="jdbc:mysql://localhost/cts";
			String url="jdbc:mysql://localhost:3306/cts";
			String username="root";
			String password="root";
			//String password="";
			
			con=DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
		}
		
		
	}

	@Override
	public boolean insertEmployee(Employee emp) {
		// TODO Auto-generated method stub

		try {
			String sql="INSERT INTO emp VALUES(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getAddress());
			ps.setInt(4, emp.getAge());
			ps.setLong(5, emp.getPhone());
			ps.setDouble(6, emp.getSalary());
			
			int result=ps.executeUpdate();
			
			if(result>0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
			return false;
		}

	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			
			String sql="SELECT id FROM emp WHERE id="+id;
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				sql="DELETE FROM emp WHERE id="+id;
				int result=stmt.executeUpdate(sql);
				if(result>0)
					return true;
				else
					return false;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		try {
			String sql="UPDATE emp SET id="+emp.getId()+", name='"+emp.getName()+"', address='"+emp.getAddress()+"', age="+emp.getAge()+", phone="+emp.getPhone()+", salary="+emp.getSalary()+" WHERE id="+emp.getId();
			Statement stmt=con.createStatement();
			int result=stmt.executeUpdate(sql);
			
			if(result>0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		try {
			
			String sql="SELECT * FROM emp WHERE id="+id;
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				Employee emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5),rs.getDouble(6));
				
				return emp;
				
			}else {
				return null;
			}
			
		}catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		try {
			
			String sql="SELECT * FROM emp";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			
			List<Employee> list=new ArrayList<>();
			
			while(rs.next()) {
				Employee emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5),rs.getDouble(6));
				list.add(emp);
			}
			
			return list;
			
		}catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

}
