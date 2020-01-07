//4. Consider an example, where the discount percentage on a TV needs to be decided
//   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
//   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
//   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
//   screen, the discount is 10% of the SP.

package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.basicjava.Discount;

public class TestDiscount {
	
	static Discount dis;
	
	@BeforeClass
	public static void init() {
		dis=new Discount();
	}
	
	@AfterClass
	public static void destroy() {
		dis=null;
	}
	
	@Test
	public void TestCase1() {
		assertEquals(5,dis.discount('C'));
	}
	
	@Test
	public void TestCase2() {
		assertEquals(10,dis.discount('L'));
	}

}
