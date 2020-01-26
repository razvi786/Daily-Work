package com.cts.assignment;

import java.util.Scanner;

public class Assg5 {
	
	static double[] inputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(sc.nextLine());
		double[] arr=new double[n];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter ["+i+"] Element: ");
			arr[i]=Double.parseDouble(sc.nextLine());
		}
		return arr;
	}

	static void outputArray(double[] arr) {
		System.out.print("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static double[] sort(double[] arr) {
		int n=arr.length;
		int min;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j])
					min=j;
			}
			if(i!=min) {
				double temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] arr;
		
		arr=inputArray();
		
		arr=sort(arr);
		System.out.println("Sorted Array is:");
		
		outputArray(arr);
		
	}

}
