package com.cts.challenge;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="chennai";
		String name1="chennai";
		
		String name2=new String("chennai");
		
		System.out.println("Equals: "+name.equals(name2));
		
		System.out.println(name+" concatenated");
		
		System.out.println("After concatenation 1: "+name);
		
		name=name+" again concatenated";
		
		System.out.println("After Concatenation 2: "+name);
		
		String date="Thursday 9 january 2020";
		
		String []dates=date.split("\\d");
		
		for(int i=0;i<dates.length;i++) {
			System.out.println(dates[i]);
		}
		
		System.out.println(dates.length);
		
	}

}
