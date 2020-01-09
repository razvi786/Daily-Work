//A cash dispenser can dispense currency notes of valuation 2000,500,200,100.
//It should be configured to dispense minimal number of currency notes.
//Write a program to help me on this. Assume amount will be given as multiple of 100.  
//Sample Input 4500 Sample Output 2000 2 500 1  
//Sample Input 3700 Sample Output 2000 1 500 3 200 1  


package com.cts.hw;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Amount to Withdraw: ");
		int n=Integer.parseInt(sc.nextLine());
		
		int count2000=0;
		int count500=0;
		int count200=0;
		int count100=0;
		
		//Counting the Notes
		while(n>0) {
			if(n>=2000) {
				n-=2000;
				count2000++;
			}else if(n>=500) {
				n-=500;
				count500++;
			}else if(n>=200) {
				n-=200;
				count200++;
			}else if(n>=100){
				n-=100;
				count100++;
			}else {
				break;
			}
				
		}
		
		System.out.println("-----WITHDRAWL NOTES-----");
		//Displaying the Notes and Count
		for(int i=0;i<4;i++) {
			if(count2000>0) {
				System.out.println("2000 - "+count2000);
				count2000=0;
			}else if(count500>0) {
				System.out.println("500 - "+count500);
				count500=0;
			}else if(count200>0) {
				System.out.println("200 - "+count200);
				count200=0;
			}else if(count100>0) {
				System.out.println("100 - "+count100);
				count100=0;
			}else {
				break;
			}
		}

	}

}
