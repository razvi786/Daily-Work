//Java Program to Add Two Complex Numbers by Passing Class to a Function

package com.cts.practise;

class Complex{
	double real;
	double imaginery;
	public Complex(double real, double imaginery) {
		super();
		this.real = real;
		this.imaginery = imaginery;
	}
}

public class AddComplexNumbers {
	
	static Complex add(Complex c1,Complex c2) {
		double real=c1.real+c2.real;
		double img=c1.imaginery+c2.imaginery;
		Complex temp=new Complex(real,img);
		return temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex c1=new Complex(1.0,3.0);
		Complex c2=new Complex(4.0,2.0);
		Complex c3;
		
		c3=add(c1,c2);
		
		System.out.println("Real: "+c3.real);
		System.out.println("Imaginery: "+c3.imaginery);

	}

}
