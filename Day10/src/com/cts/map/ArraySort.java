package com.cts.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(12,4,22,67,15));
													//Used to add elements in insertion order
		System.out.println(al);
		
		Collections.sort(al); //it uses merge sort
		
		System.out.println(al);
		
	}

}
