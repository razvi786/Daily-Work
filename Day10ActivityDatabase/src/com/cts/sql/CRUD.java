package com.cts.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

		//1. A databse (MySql)
		//2. Database Jar File (JDBC API)
		//3. Driver Class (For the database)
		//4. Database URL (Database Address)
		//Load the driver class
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//Establish the connection with database
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="root";
		
		//connection is an interface inside java.sql
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		//create a Statement		
		
//		Statement stmt=con.createStatement(); //used to execute the query
		
//		String sql="INSERT INTO emp VALUES (108,'Razvi','Yakutpura',630666666,58000);";
//		String sql="UPDATE emp SET address='Mehdipatnam' WHERE id=102;";
//		String sql="DELETE FROM emp WHERE id=108";
//		
//		int result=stmt.executeUpdate(sql); //result contains no of rows affected
//		
//		if(result>0) {
//			System.out.println("Query Executed Successfully");
//		}else {
//			System.out.println("Error in Executing Query");
//		}

		
		
//		String sql="SELECT * FROM emp";
//		
//		//for insertion and deletion, we should use executeUpdate() and it returns integer number
//		//of number of rows affected
//		
//		ResultSet rs=stmt.executeQuery(sql);
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt("id")+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4)+" : "+rs.getString(5));
//		}
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Address: ");
		String address=sc.nextLine();
		System.out.print("Phone: ");
		String phone=sc.nextLine();
		System.out.print("Salary: ");
		String salary=sc.nextLine();
		
		String sql="INSERT INTO emp VALUES (?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3, address);
		ps.setString(4,phone);
		ps.setString(5, salary);
		
		int result=ps.executeUpdate();
		if(result>0)
			System.out.println("Data inserted Successfully");
		else
			System.out.println("Query Failed");
		
		
		
	}

}
