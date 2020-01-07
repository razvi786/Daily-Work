package com.cts.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {
	
	static SumOfArray sum;
	
	@BeforeClass
	public static void init() {
		sum=new SumOfArray();
		System.out.println("Object Created");
	}
	
	@AfterClass
	public  static void destroy() {
		sum=null;
		System.out.println("Object Destroyed");
	}

	@Test
	public void sum() {
		assertEquals(55,sum.sumOfArray(10));
	}
	
	@Test
	public void factorial() {
		assertEquals(120,sum.factorial(5));
	}

}
