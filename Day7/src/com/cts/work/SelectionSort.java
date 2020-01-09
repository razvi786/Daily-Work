//Consider the following unsorted list
//    Neena Meeta Geeta Reeta Seeta
//    Sort the list using selection sort algorithm. Show the status of the list after every iteration.

package com.cts.work;

import java.util.Scanner;

public class SelectionSort {
	
	public static void display(String[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static boolean firstSmall(String s1,String s2) {
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)<s2.charAt(i))
				return true;
			if(s1.charAt(i)>s2.charAt(i))
				return false;
		}
		return false;
	}
	
	public static String[] selectionSort(String a[]) {
		System.out.println("-----SELECTION SORT-----");
		int min;
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(!firstSmall(a[min].toLowerCase(),a[j].toLowerCase()))
					min=j;
			}
			if(i!=min) {
				String temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			System.out.print("Pass-"+(i+1)+": ");
			display(a);
			System.out.println();
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String[] names;
		
		System.out.print("Enter Names Count: ");
		int n=Integer.parseInt(sc.nextLine());
		
		names=new String[n];
		
		System.out.print("Enter "+n+" Elements(Seperated by Space): ");
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
		
		names=selectionSort(names);
		
		System.out.println("\nSorted Names are: ");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		
	}

}
