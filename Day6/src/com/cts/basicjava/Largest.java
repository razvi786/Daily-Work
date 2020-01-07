package com.cts.basicjava;

public class Largest {

	public int largest(int a,int b,int c) {
		int large=a;
		if(b>large)
			large=b;
		if(c>large)
			large=c;
		return large;
	}
}
