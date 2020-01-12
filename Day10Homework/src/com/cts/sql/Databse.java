package com.cts.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Databse {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/cts";
		String username="root";
		String password="";
		
		Connection con=DriverManager.getConnection(url, username, password);
		
//		Scanner sc = new Scanner(System.in);
//		
//		int id=Integer.parseInt(sc.nextLine());
//		String name=sc.nextLine();
//		String address=sc.nextLine();
//		long phone=Long.parseLong(sc.nextLine());
		
//		String sql="INSERT INTO emp VALUES (?,?,?,?)";
		
//		Statement stmt=con.createStatement();

//		String sql="INSERT INTO emp VALUES (102,'Ehsan','Yakutpura',123456789)";
		
//		String sql="UPDATE emp SET address='Charminar' WHERE id=102";
		
//		String sql="DELETE FROM emp WHERE id=102";
		
//		int result=stmt.executeUpdate(sql);
		
//		PreparedStatement ps=con.prepareStatement(sql);
//		
//		ps.setInt(1, id);
//		ps.setString(2, name);
//		ps.setString(3, address);
//		ps.setLong(4,phone);
//		
//		int result=ps.executeUpdate();
		
//		if(result>0)
//			System.out.println("Query Executed");
//		else
//			System.out.println("Query Not Executed");
		
		Statement stmt=con.createStatement();
		
		String sql="SELECT * FROM emp";
		
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			
//			if(rs.getInt("id")!=108)
//				continue;
			
			System.out.println(rs.getInt("id")+" \t "+rs.getString(2)+" \t\t "+rs.getString("address")+" \t\t "+rs.getLong(4));
		
		}
		
		
		con.close();
		
	}

}
