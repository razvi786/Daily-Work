package com.cts.oops;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		a.area(24);
		a.area(2,2);
		a.area(2.0,4.0);
	}

}

class Area{
	public static final double PI=3.14;
	public void area(double a) {
		System.out.println("Area of Square is: "+(a*a));
	}
	public void area(double a,double b) {
		System.out.println("Area of Rectangle is: "+(2*a*b));
	}
	public void area(int a,float b) {
		System.out.println("Area of Triangle is: "+((a*b)/2));
	}
	public void area(int a) {
		System.out.println("Area of circle is: "+(PI*a*a));
	}
}