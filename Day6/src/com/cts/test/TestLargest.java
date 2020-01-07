//7. Write a Program to accept three numbers and to display the largest of the three numbers.



package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.Largest;

public class TestLargest {
	
	static Largest lg;
	
	@BeforeClass
	public static void init() {
		lg=new Largest();
	}
	
	@AfterClass
	public static void destroy() {
		lg=null;
	}
	
	@Test
	public void TestCase1() {
		assertEquals(6,lg.largest(3, 6, 1));
	}
	
	@Test
	public void TestCase2() {
		assertEquals(56,lg.largest(13,56,34));
	}
	
	@Test
	public void TestCase3() {
		assertEquals(100,lg.largest(60,34,100));
	}

}
