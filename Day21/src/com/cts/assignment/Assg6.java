package com.cts.assignment;

import java.util.Scanner;

public class Assg6 {
	
	static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(sc.nextLine());
		int[] arr=new int[n];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter ["+i+"] Element: ");
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		return arr;
	}

	static void outputArray(int[] arr) {
		System.out.print("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void maxMin(int[] arr) {
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr;
		
		arr=inputArray();
		
		outputArray(arr);
		
		maxMin(arr);
		
		
	}

}
