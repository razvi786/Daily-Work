//1. Write a program in C to read n number of values in an array and display it in reverse order

package Arrays;

import java.util.Scanner;

import Arrays.Array;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array a=new Array();

		int arr[];
		
		arr=a.inputArray();
		
		a.outputArray(arr);
		
		System.out.println();
		System.out.print("Array Elements in Reverse: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
