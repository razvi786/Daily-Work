//2. Write a Program that accepts the length and breadth of a
//   rectangle and displays its area and perimeter.


package com.cts.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.AreaPerimeter;
import com.cts.basicjava.PositiveNegative;

public class TestAreaPerimeter {
	static AreaPerimeter ap;

	@BeforeClass
	
	public static void init() {
		ap=new AreaPerimeter();
	}

	@AfterClass
	public static void destroy() {
		ap=null;
	}

	@Test
	public void testArea() {
		assertEquals(6,ap.area(2, 3));
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(10,ap.perimeter(2, 3));
	}
}
