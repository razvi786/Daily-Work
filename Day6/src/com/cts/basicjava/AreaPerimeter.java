package com.cts.basicjava;

import java.util.Scanner;

public class AreaPerimeter {

	public static int area(int length,int breadth) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Length of Rectangle: ");
//		int length=Integer.parseInt(sc.nextLine());
//		
//		System.out.println("Enter Breadth of Rectangle: ");
//		int breadth=Integer.parseInt(sc.nextLine());
		
		int area=length*breadth;
		
		return area;
		
	}
	
	public static int perimeter(int length,int breadth) {
		
		int perimeter=2*(length+breadth);
		
		return perimeter;
		
	}

}
