package com.cts.assignment;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb=new StringBuffer();
		
		System.out.print("Enter an Input String: ");
		String input=sc.nextLine();
		sb.append(input);

		String rev=sb.reverse().toString();
		
		if(input.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
