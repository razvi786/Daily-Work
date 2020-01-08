//Write a program which accepts two integers as a minimum and maximum limit and calculates total of how many 1s were their within the limit.
//    For ex:
//    1) if user input 1 11 then it should print 4.
//    2) if user input 11 111 then it should print 34.

package com.cts.work;

import java.util.Scanner;

public class NumberOnes {
	
	public static int checkOne(int n) {
		
		int count=0;
		int temp;
		while(n>0) {
			temp=n%10;
			if(temp==1)
				count++;
			n=n/10;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Minimun Number: ");
		int min=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Maximum Number: ");
		int max=Integer.parseInt(sc.nextLine());
		
		int count=0;
		for(int i=min;i<=max;i++) {
			count=count+checkOne(i);
		}
		
		System.out.println("Number of 1's in Between are: "+count);

	}

}
