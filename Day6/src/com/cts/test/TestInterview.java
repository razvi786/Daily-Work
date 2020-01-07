//5. Consider a scenario where all candidates have to take two tests before appearing for an
//   interview. A candidate is selected for the interview round, based on the scores of the two
//   tests. The individual score in each test should be greater than 75, and the average
//   score for the two tests should be a minimum of 80. A call letter for the interview is to
//   be sent to candidates who have been selected, and a rejection letter is to be sent to
//   the rest.


package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.Interview;

public class TestInterview {
	
	static Interview i;
	
	@BeforeClass
	public static void init() {
		i=new Interview();
	}
	
	@AfterClass
	public static void destroy() {
		i=null;
	}
	
	@Test
	public void TestCase1() {
		assertEquals("Call Letter",i.interview(90, 90));
	}
	
	@Test
	public void TestCase2() {
		assertEquals("Rejection Letter",i.interview(70, 100));
	}
	
	@Test
	public void TestCase3() {
		assertEquals("Rejection Letter",i.interview(76, 80));
	}

}
