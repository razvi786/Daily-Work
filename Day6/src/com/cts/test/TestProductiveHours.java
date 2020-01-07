//6. Write a Program to accept hours and number of resources and display the total
//   number of productive hours. (Total number of productive hours = hours * number of
//   resources).


package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.ProductiveHours;

public class TestProductiveHours {
	
	static ProductiveHours ph;
	
	@BeforeClass
	public static void init() {
		ph=new ProductiveHours();
	}
	
	@AfterClass
	public static void destroy() {
		ph=null;
		
	}
	
	@Test
	public void TestCase1() {
		assertEquals(15,ph.productiveHours(5, 3));
	}
	
	@Test
	public void TestCase2() {
		assertEquals(50,ph.productiveHours(10, 5));
	}
	
	@Test
	public void TestCase3() {
		assertEquals(63,ph.productiveHours(9, 7));
	}

}
