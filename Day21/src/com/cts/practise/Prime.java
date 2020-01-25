//Check Whether a Number is Prime or Not

package com.cts.practise;

public class Prime {
	
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=76;
		System.out.println(isPrime(num));
	}

}
