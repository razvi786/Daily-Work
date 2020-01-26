package com.cts.assignment;

import java.util.Scanner;

public class Assg4 {
	
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
	}
	
	static int[] sort(int[] arr) {
		int n=arr.length;
		int min;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j])
					min=j;
			}
			if(i!=min) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr;
		
		arr=inputArray();
		
		arr=sort(arr);
		System.out.println("Sorted Array is:");
		
		outputArray(arr);
		
		
	}

}
