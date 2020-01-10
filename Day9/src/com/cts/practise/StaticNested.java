package com.cts.practise;

//import java.util.Scanner;
//import java.util.*;


public class StaticNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Outer.Inner inner=new Outer.Inner();
//		Outer outer=new Outer();
		
		Outer.Inner.display();

	}

}


class Outer{
	int x=10;
	static int y=20;
	static class Inner{
		public static void display() {
			Outer o=new Outer();
			System.out.println(o.x);
			System.out.println(y);
		}
	}
}