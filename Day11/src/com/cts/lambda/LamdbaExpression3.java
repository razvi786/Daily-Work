package com.cts.lambda;

public class LamdbaExpression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=()->System.out.println("I am Runnable Interface");
		Thread t=new Thread(r);
		
		t.start();
	}

}

@FunctionalInterface
interface Hello2{
	public void display();
}