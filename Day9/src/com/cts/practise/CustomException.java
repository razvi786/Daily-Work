package com.cts.practise;

import java.util.Scanner;

public class CustomException {
	
	public static boolean hasUppercase(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				return true;
		}
		return false;
	}
	
	public static boolean hasNumber(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
				return true;
		}
		return false;
	}
	
	public static boolean hasSymbol(String str) {
		for(int i=0;i<str.length();i++) {
			int ch=str.charAt(i);
			if((ch>=33 && ch<=47)||(ch>=58 && ch<=64))
				return true;
		}
		return false;
	}

	public static boolean isValid(String pwd) throws InvalidPassword {
		if (pwd.length() < 8) {
			throw new InvalidPassword("Password Cannot be less than 8 Characters");
		}else if(!hasUppercase(pwd)) {
			throw new InvalidPassword("Password Must have atleast one Uppercase Letter");
		}else if(!hasNumber(pwd)) {
			throw new InvalidPassword("Password Must have atleast one Number");
		}else if(!hasSymbol(pwd)) {
			throw new InvalidPassword("Password Must have atleast one Symbol");
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Password: ");
		String pwd=sc.nextLine();
		try {
			isValid(pwd);
			System.out.println("Password Validated.");
		} catch (InvalidPassword e) {
			System.out.println("Exception Catched: " + e.getException());
		}
		
		
	}
}

class InvalidPassword extends Exception {
	InvalidPassword() {
		System.out.println("Invalid Password");
	}

	InvalidPassword(String msg) {
		System.out.println(msg);
	}

	public String getException() {
		return "Password is Invalid";
	}
}
