package com.cts.lambda;

public class LamdbaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Anonymous inner class
//		Hello hello=new Hello() {
//			
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				System.out.println("This is inner Class");
//			}
//		};
//		
//		hello.display();
		
		
		
//		Lambda Expression
		Hello h=()->System.out.println("Inside Inner Class");
		
//		Hello h=()->{System.out.println("Inner Class");};
		
		h.display();
	}

}

interface Hello{
	public void display();
}