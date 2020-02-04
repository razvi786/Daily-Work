package com.cts.activity.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.activity.bean.User;
import com.cts.activity.dao.UserDAO;
import com.cts.activity.daoimpl.UserDAOImpl;

//@WebServlet("/register")
public class HelloServlet extends HttpServlet{
	
	private static final long serialVersionUID = 7184525338291053387L;

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirm_password=request.getParameter("confirm_password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String[] progs=request.getParameterValues("prog");
		
		UserDAO userDAO=new UserDAOImpl();
		
		RequestDispatcher rd;
		
		if(userDAO.confirmPassword(password, confirm_password)) {
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			user.setPhone(Long.parseLong(phone));
			user.setAdmin(false);
			user.setConfirmed(false);
			user.setCode(0);
			user.setLanguages(progs);
			if(userDAO.saveUser(user)) {
				rd=request.getRequestDispatcher("login.html");
				rd.forward(request, response);
			}else {
				out.println("User not Registered to Database");
				rd=request.getRequestDispatcher("register.html");
				rd.include(request, response);
			}
		}else {
			out.println("Your Passwords doesn't Match");
			rd=request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
		
		
		
	}

}
