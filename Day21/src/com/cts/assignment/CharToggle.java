package com.cts.assignment;

import java.util.Scanner;

public class CharToggle {
	
	static void toggle(String s) {
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch==' ')
				System.out.print(ch);
			else if(i%2==1) {
				if(Character.isUpperCase(ch))
					System.out.print(Character.toLowerCase(ch));
				else
					System.out.print(Character.toUpperCase(ch));
			}else {
				System.out.print(ch);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Input String: ");
		String input=sc.nextLine();
		
		toggle(input);

	}

}
