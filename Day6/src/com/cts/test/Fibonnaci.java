package com.cts.test;

public class Fibonnaci {

	public int fibonnaci(int a, int b, int n) {
		if (n == 0)
			return n;
		System.out.println(a);
		fibonnaci(b, a + b, n - 1);
		return n;
	}

}
