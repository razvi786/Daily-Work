//1. Write a Program that accepts a number and checks whether it's positive, negative, or
//   zero.

package com.cts.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.PositiveNegative;

public class TestPositive {

	static PositiveNegative pos;

	@BeforeClass
	public static void init() {
		pos=new PositiveNegative();

	}

	@AfterClass
	public static void destroy() {

		pos=null;
	}

	@Test
	public void testPositive() {
		assertEquals("Positive",pos.isPositive(3));
	}
	
	@Test
	public void testNegative() {
		assertEquals("Negative",pos.isPositive(-3));
	}
	
	@Test
	public void testZero() {
		assertEquals("Neither Positive nor Negative",pos.isPositive(0));
		
	}
	
}
