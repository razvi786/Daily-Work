//8. Write a Program to accept the age of the user and then, display the category of the
//   user. Based on the age, the categories of the users are:
//	05-12 Children
//	13-19 Teenagers
//	20-35 Young adults
//	36-45 Mature adults
//	46-55 Elders
//	56 and above Seniors



package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.Category;

public class TestCategory {
	
	static Category c;
	
	@BeforeClass
	public static void init() {
		c=new Category();
	}
	
	@AfterClass
	public static void destroy() {
		c=null;
	}
	
	@Test
	public void TestCase1() {
		assertEquals("Seniors",c.category(60));
	}
	
	@Test
	public void TestCase2() {
		assertEquals("Elders",c.category(49));
	}
	
	@Test
	public void TestCase3() {
		assertEquals("Children",c.category(9));
	}
	
	@Test
	public void TestCase4() {
		assertEquals("Teenagers",c.category(18));
	}
	
	@Test
	public void TestCase5() {
		assertEquals("Enter correct age",c.category(0));
	}

}
