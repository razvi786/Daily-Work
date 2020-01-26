package com.cts.assignment;

import java.util.Scanner;

public class Assg7 {
	
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
	
	static int[] deleteElement(int[] arr,int x) {
		for(int i=x;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				break;
			}
		}
		int a[]=new int[arr.length-1];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=arr[i];
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		arr=inputArray();
		
		outputArray(arr);
		
		System.out.print("Enter the index position to delete an element: ");
		int index=Integer.parseInt(sc.nextLine());
		int n=arr.length;
		if(index<n&&index>=0) {
			arr=deleteElement(arr, index);
			outputArray(arr);
		}else {
			System.out.println("Array index out of Bounds: "+index);
		}

	}

}
