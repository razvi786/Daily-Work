//Calculate LCM using GCD

package com.cts.practise;

public class LCMGCD {
	
	static int gcd(int n1,int n2) {
		
		int gcd=1;
		
		for(int i=2;(i<=n1)&&(i<=n2);i++) {
			if((n1%i==0)&&(n2%i==0)) {
				gcd=i;
			}
		}
		
		return gcd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10,num2=25;
		
		int gcd=gcd(num1,num2);
		
		int lcm=(num1*num2)/gcd;
		
		System.out.println(lcm);

	}

}
