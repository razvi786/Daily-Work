//Write a program which takes input as a string and sort all the alphabets in string.
//    Example :
//    1) If user gives input "helloword" then output string should be "dehllloorw".
//    2) If user gives input "PROGRAMR" then output string should be "AGMOPRRR".

package com.cts.work;

import java.util.Scanner;

public class SortString {

	public static char[] sort(char a[]) {
		int min = 0;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j])
					min = j;
			}
			if (i != min) {
				char temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();

		// converting String to char
		char arr[] = new char[str.length()];
		arr = str.toCharArray();

		// sorting the array
		arr = sort(arr);

		// converting char to String
		String sorted = new String(arr);

		System.out.println("Sorted String is: " + sorted);

	}

}
