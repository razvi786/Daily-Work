//Java Program to Check Whether a Number is Palindrome or Not

package com.cts.practise;

public class PalindromeOrNot {
	
	static int reverse(int n) {
		
		int rev=0,rem,num=n;
		
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4848;
		int rev=reverse(num);
		
		if(num==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
