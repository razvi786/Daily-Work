package com.cts.practise;

public class ExceptionDemo {
	
	public static void logic(String input) throws NullPointerException,ArrayIndexOutOfBoundsException{
		System.out.println("Begin");
		int a=Integer.parseInt(input);
		System.out.println("Got Value from user");
		if(a==10)
			throw new ArithmeticException();
		int b=10/(10-a);
		System.out.println("b= "+b);
		String name="Syed";
		name=null;
		System.out.println("Height: "+name.length());
		System.out.println("Stop");
	}

	public static void main(String[] args){
		
		try {
			logic(args[0]);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}

