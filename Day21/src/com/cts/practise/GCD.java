package com.cts.practise;

public class GCD {
	
	static int gcd(int n1,int n2) {
		int gcd=1;
		
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				gcd=i;
			}
		}
		
		return gcd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=75,num2=100;
		System.out.println(gcd(num1,num2));
		
	}

}
