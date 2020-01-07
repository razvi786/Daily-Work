package com.cts.test;

public class SumOfArray {
	
	public int sumOfArray(int n) {
		if(n==1)
			return 1;
		return n+sumOfArray(n-1);
	}

	public int factorial(int n) {
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
