package com.cts.activity.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.activity.dao.UserDAO;
import com.cts.activity.daoimpl.UserDAOImpl;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 2819518014516080478L;

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		UserDAO userDAO=new UserDAOImpl();
		
		RequestDispatcher rd=null;
		
		System.out.println(username+" " +password);
		System.out.println(userDAO.isValidUser(username, password));
		if(userDAO.isValidUser(username, password)) {
			rd=request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);	
		}else {
			out.println("Invalid Credentials");
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}
}
