package com.cts.test;

public class GeneralAPI {

	public int add(int a,int b) {
		return a+b;
	}
	
	public boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;
	}
	
	public int getFactorial(int num) {
		if(num==1)
			return 1;
		return num*getFactorial(num-1);
	}
	
	public boolean isPrime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
