package com.cts.assignment;

import java.util.Scanner;

public class Assg9 {
	
	static int countSpaces(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				count++;
		}
		return count;
	}
	
	static String[] split(String s) {
		int count=countSpaces(s);
		String[] out=new String[count+1];
		for(int i=0,n=0,c=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				out[c]=s.substring(n, i);
				c++;
				n=i+1;
			}
			if(i==s.length()-1) {
				out[c]=s.substring(n, i+1);
				break;
			}
		}
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Input String: ");
		String input=sc.nextLine();
		
		String output[]=split(input);
		
		for(String sub:output) {
			System.out.println(sub);
		}
		
	}

}
