package com.cts.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Strings (type 'exit' to end):");
		int i=0;
		StringBuffer sb=new StringBuffer();
		String word;
		ArrayList<String> al=new ArrayList();
		do {
			System.out.print("Enter String: ");
			word=sc.nextLine();
			if(!word.equalsIgnoreCase("exit"))
					al.add(word);
		}while(!word.equalsIgnoreCase("exit"));

		Collections.sort(al);
		System.out.print("Sorted ArrayList: ");
		System.out.print(al);
	}

}


