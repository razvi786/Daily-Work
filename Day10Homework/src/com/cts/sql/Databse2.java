package com.cts.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Databse2 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/cts";
		String username="root";
		String password="";
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		String sql="INSERT INTO emp VALUES(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 110);
		ps.setString(2, "YAM");
		ps.setString(3, "Maula Ali");
		ps.setLong(4, 786);
		
		int result=ps.executeUpdate();
		
		if(result>0)
			System.out.println("Executed");
		else
			System.out.println("Not Executed");
		
		

	}

}
