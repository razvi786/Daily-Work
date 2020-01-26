package com.cts.assignment;

import java.util.Scanner;

public class Assg8 {
	
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
	
	static int[] insertElement(int[] arr,int x,int ele) {
		int[] a=new int[arr.length+1];
		int last=arr[arr.length-1];
		for(int i=arr.length-2;i>=x;i--) {
			arr[i+1]=arr[i];
		}
		arr[x]=ele;
		for(int i=0;i<arr.length;i++) {
			a[i]=arr[i];
		}
		a[arr.length]=last;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		arr=inputArray();
		
		outputArray(arr);
		
		System.out.print("Enter the index position to insert an element: ");
		int index=Integer.parseInt(sc.nextLine());
		int n=arr.length;
		if(index<=n&&index>=0) {
			System.out.print("Enter Element: ");
			int ele=Integer.parseInt(sc.nextLine());
			arr=insertElement(arr, index,ele);
			outputArray(arr);
		}else {
			System.out.println("Array index out of Bounds: "+index);
		}

	}

}
