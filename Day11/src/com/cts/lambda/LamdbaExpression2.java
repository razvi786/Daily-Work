package com.cts.lambda;

public class LamdbaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello3 add=(a,b)->a+b;
		System.out.println(add.operation(10, 40));
		
		Hello3 mul=(a,b)->a*b;
		System.out.println(mul.operation(10, 3));
		
		Hello3 sub=(a,b)->a-b;
		System.out.println(sub.operation(45,5));
		
	}

}

@FunctionalInterface
interface Hello3{
	public int operation(int a,int b);
}
