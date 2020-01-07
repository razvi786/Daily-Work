package Arrays;

import java.util.Scanner;

public class Array {
	
	Scanner sc=new Scanner(System.in);

	public int[] inputArray() {
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Input Array Elements");
		for(int i=0;i<size;i++) {
			System.out.print("Enter Element-"+i+": ");
			a[i]=sc.nextInt();
		}
		
		return a;
		
	}
	
	public void outputArray(int[] a) {
		System.out.println();
		System.out.print("Array Elements: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
