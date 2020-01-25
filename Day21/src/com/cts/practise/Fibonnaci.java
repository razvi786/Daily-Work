//Display Fibonacci Series

package com.cts.practise;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c=a+b;
		System.out.print(a+" "+b+" ");
		while(c<10) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

}
