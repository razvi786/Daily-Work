package com.cts.basicjava;

import java.util.Scanner;

public class Discount {
	
	Scanner sc=new Scanner(System.in);
	
	public int discount(char ch) {
		if(ch=='C')
			return 5;
		else {
			System.out.println("Enter the size of inches of your LCD(14/21): ");
			int size=sc.nextInt();
			if(size==14)
				return 8;
			else
				return 10;
		}
	}

}
