package com.cts.work;

import java.util.Scanner;

public class SortString {
	
	public static int[] sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		int arr[]=new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		
		arr=sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((char)arr[i]);
		}

	}

}
