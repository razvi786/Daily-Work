//48 to 57

package com.cts.assignment;

import java.util.Scanner;

public class Assg1 {
	
	static Scanner sc;
	
	static boolean isValidName(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
				return false;
		}
		return true;
	}
	
	static String validateName(String s) {
		sc = new Scanner(System.in);

		while(!isValidName(s)) {
			System.out.print("Please Enter a Valid Name without any numbers: ");
			s=sc.nextLine();
		}
		
		return s;
	}

	static boolean isValidYear(String s) {
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)<48||s.charAt(i)>57)
				return false;
			if(s.contains("."))
				return false;
		}
		return true;
	}
	
	static String validateYear(String s) {
		sc = new Scanner(System.in);

		while(!isValidYear(s)) {
			System.out.print("Please Enter a Valid Year with integers only: ");
			s=sc.nextLine();
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name=sc.nextLine();
		name=validateName(name);
		System.out.print("Enter Your Graduation Year: ");
		String graduation=sc.nextLine();
		graduation=validateYear(graduation);
		System.out.println("My Name is "+name+" and I'll Graduate in "+graduation);
		
	}

}
