//Java Program to Find LCM of two Numbers

package com.cts.practise;

public class LCM {
	
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//Method-1
	static int lcm1(int n1,int n2) {
		int lcm=1;
		for(int i=2;i<=n1&&i<=n2;i++) {
			if(isPrime(i)) {
				if((n1%i==0)&&(n2%i==0)) {
					n1/=i;
					n2/=i;
					lcm*=i;
					i-=1;
					
				}
			}
		}
		if(n1!=1) {
			lcm*=n1;
		}
		if(n2!=1) {
			lcm*=n2;
		}
		return lcm;
	}
	
	//Method-2
	static int lcm2(int n1,int n2) {
		int lcm=1;
		while(true) {
			if((lcm%n1==0)&&(lcm%n2==0)) {
				return lcm;
			}
			lcm++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num1=10,num2=15;
		System.out.println(lcm1(num1,num2));
		System.out.println(lcm2(num1,num2));

	}

}
