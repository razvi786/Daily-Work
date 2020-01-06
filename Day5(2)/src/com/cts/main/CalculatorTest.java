package com.cts.main;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	static Calculator calc;
	
	@BeforeClass
	public static void init() {
		calc=new Calculator();
		System.out.println("Object created");
	}
	
	@AfterClass
	public static void distroy() {
		calc=null;
		System.out.println("Object Destroyed");
	}

	@Test
	public void AddTest() {
		assertEquals(5,calc.add(2, 3));
	}
	
	@Test
	public void SubTest() {
		assertEquals(-1,calc.sub(2, 3));
	}
	
	@Test
	public void MulTest() {
		assertEquals(10,calc.mul(2, 5));
	}
	
	@Test
	public void DivTest() {
		assertEquals(5,calc.div(25, 5));
	}

}
