//Java Program to Check Whether a Number is Palindrome or Not

package com.cts.practise;

public class Palindrome {
	
	static boolean isPalindrome(int n) {
		int num=n,rem,rev=0;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=570474075;
		System.out.println(isPalindrome(num));
		

	}

}
