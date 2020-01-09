//Given a string say "abcdef" all the characters need to be replaced
// by their reflections . Like a is replaced with z , b with y etc. The
// input string is guaranteed to have all lowercase characters.
//    Sample Input:
//     abcd
//     Output:
//     zyxw


package com.cts.hw;

import java.util.Scanner;

public class Reflection {
	
	public static char reflectChar(char ch) {
		
		String a="abcdefghijklmnopqrstuvwxyz";
		int i=a.indexOf(ch);
		char ref=a.charAt(a.length()-i-1);
		return ref;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String (in lower case): ");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			char ref=reflectChar(str.charAt(i));
			sb.append(ref);
		}
		
		System.out.println(sb);
		sc.close();

	}

}
