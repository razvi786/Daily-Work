package com.cts.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.PositiveNegative;

public class TestCase {

	static Fibonnaci fib;


	@BeforeClass
	public static void init() {
		fib = new Fibonnaci();
	}

	@AfterClass
	public static void destroy() {
		fib = null;

	}

	@Test
	public void testFactorial() {
		assertEquals(10, fib.fibonnaci(0, 1, 10));
	}
	
	@Test
	public void testFactorial2() {
		assertEquals(5, fib.fibonnaci(0, 1, 5));
	}

}
