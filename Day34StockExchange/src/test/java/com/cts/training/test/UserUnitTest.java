package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;
import com.cts.training.daoimpl.UserDAOImpl;

public class UserUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private static User user;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user=(User) context.getBean("user");
		userDAO=(UserDAO) context.getBean("userDAO");
	}

	@Test
	@Ignore
	public void test_get_all_users() {
		List<User> users=userDAO.getAllUsers();
		assertEquals(5, users.size());
	}
	
	@Test
	@Ignore
	public void test_add_user() {
		User user=new User(147, "nagasri", "hometown", false, "naga@123", 54321, false, 012);
		assertEquals(true, userDAO.saveUser(user));
	}
	
	@Test
	@Ignore
	public void test_update_user() {
		User user=userDAO.getUserById(68);
		user.setConfirmed(true);
		assertEquals(true, userDAO.updateUser(user));
	}
	
	@Test
	@Ignore
	public void test_delete_user() {
		User user=userDAO.getUserById(70);
		assertEquals(true, userDAO.removeUser(user));
	}
	
	@Test
	@Ignore
	public void test_valid_user() {
		assertEquals(true, userDAO.isValidUser("Syed","hello"));
	}
	
	@Test
	@Ignore
	public void test_valid_user_fail() {
		assertEquals(false, userDAO.isValidUser("Syed","hello123"));
	}
	
	@Test
	@Ignore
	public void test_get_user_by_id() {
		User user=userDAO.getUserById(1997);
		assertEquals(null, user);
	}
	
	@Test
	@Ignore
	public void test_get_user_by_id_fail() {
		assertEquals(false, userDAO.getUserById(1997));
	}
	
	
	
	
	

}
