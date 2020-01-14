package com.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneralAPITest {

	GeneralAPI gapi=null;
	
	@Before
	public void start() {
		gapi=new GeneralAPI();
		System.out.println("General API Object Created");
	}
	
	@After
	public void destroy() {
		gapi=null;
		System.out.println("General API Object Destroyed");
	}
	
	@Test
	public void testAdd() {
		assertEquals(14, gapi.add(8, 6));
	}
	@Test
	public void testEven() {
		assertEquals(true, gapi.isEven(8));
	}

}
