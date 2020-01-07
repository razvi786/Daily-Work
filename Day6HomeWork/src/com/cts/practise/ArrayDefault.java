package com.cts.practise;

public class ArrayDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iArray[]=new int[5];
		
		String sArray[]=new String[5];
		
		char cArray[]=new char[5];
		
		double dArray[]=new double[5];
		
		System.out.print("Integer Array: ");
		for(int i=0;i<5;i++) {
			System.out.print(iArray[i]+" ");
		}
		System.out.println();
		
		System.out.print("String Array: ");
		for(int i=0;i<5;i++) {
			System.out.print(sArray[i]+" ");
		}
		System.out.println();
		
		System.out.print("Character Array: ");
		for(int i=0;i<5;i++) {
			System.out.print(cArray[i]+" ");
		}
		System.out.println();
		
		System.out.print("Double Array: ");
		for(int i=0;i<5;i++) {
			System.out.print(dArray[i]+" ");
		}
		System.out.println();

	}

}
