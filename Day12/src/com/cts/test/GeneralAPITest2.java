package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GeneralAPITest2 {

		static GeneralAPI gapi=null;
		
		@BeforeClass
		public static void start() {
			gapi=new GeneralAPI();
			System.out.println("General API Object Created");
		}
		
		@AfterClass
		public static void destroy() {
			gapi=null;
			System.out.println("General API Object Destroyed");
		}
		
		@Ignore
		@Test
		public void testAdd() {
			assertEquals(14, gapi.add(8, 6));
		}
		@Test
		public void testEven() {
			assertEquals(true, gapi.isEven(8));
		}
		@Test
		public void factorialTest() {
			assertEquals(120,gapi.getFactorial(5));
		}
		@Test
		public void primeTest() {
			assertEquals(false,gapi.isPrime(27));
		}
		
	}
