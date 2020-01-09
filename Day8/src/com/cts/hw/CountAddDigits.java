//Given a number we need to find the number of times its digits need
// to be added so it becomes a single digit number .
//    Example 91=9+1=10
//    10=1+0=1
//    So two times.
//    Sample Input
//    91
//    output
//    2



package com.cts.hw;

import java.util.Scanner;

public class CountAddDigits {
	
	public static int sumOfDigits(int num) {
		int temp=0,sum=0;
		while(num>0) {
			temp=num%10;
			sum+=temp;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=Integer.parseInt(sc.nextLine());
		int count=0;
		while(num>9) {
			num=sumOfDigits(num);
			count++;
		}
		System.out.println("Number of Additions needed: "+count);
		
	}

}
