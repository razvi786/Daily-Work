package com.cts.practise;

public class Armstrong {
	
	static int armstrong(int n) {
		int num=n,arm=0,rem;
		while(num>0) {
			rem=num%10;
			arm+=Math.pow(rem, 3);
			num/=10;
		}
		return arm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=372;
		
		if(armstrong(num)==num) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
		
	}

}
