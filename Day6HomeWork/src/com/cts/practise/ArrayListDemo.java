package com.cts.practise;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>(0);
		
		al.add(45);
		al.add(67);
		al.add(79);
		al.add(69);
		
		al.remove(1);
		
		boolean c=al.contains(70);
		
//		Object[] arr;
		
		System.out.println(c);
		
		System.out.print("Array List: ");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		
//		arr=al.toArray();
//		int sum=0;
//		System.out.print("Array Object: ");
//		for(int i=0;i<arr.length;i++) {
////			System.out.print(arr[i]+" ");
//			sum=sum+arr[i];
//		}
//		
		
	}

}
