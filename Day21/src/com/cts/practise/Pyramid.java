//Create Pyramid and Pattern with name EHSAN


package com.cts.practise;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[]=new char[]{'E','H','S','A','N'};
		
		for(int i=0;i<5;i++) {
			for(int space=5-(i+2);space>=0;space--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
	}

}
