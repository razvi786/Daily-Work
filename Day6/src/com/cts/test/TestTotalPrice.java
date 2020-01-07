//3. You have to write a Program that accepts the product name and quantity as input
//   and displays the total price using the unit prices already stored in the system.

package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.TotalPrice;

public class TestTotalPrice {
	
	static TotalPrice tp;
	
	@BeforeClass
	public static void init() {
		tp=new TotalPrice();
	}
	
	@AfterClass
	public static void destroy() {
		tp=null;
	}
	
	@Test
	public void testCase1() {
		assertEquals(20,tp.price("Pen", 4));
	}

	@Test
	public void testCase2() {
		assertEquals(200,tp.price("Book", 10));
	}
	
	@Test
	public void testCase3() {
		assertEquals(500,tp.price("Watch", 5));
	}
}
