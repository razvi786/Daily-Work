//Java Program to Concatenate Two Arrays

package com.cts.practise;

public class ArrayConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {6,7,8,9,10};
		
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			c[i+a.length]=b[i];
		}
		
		for(int x:c) {
			System.out.print(x+" ");
		}

	}

}
