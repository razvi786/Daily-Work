package com.cts.practise;

import java.io.IOException;

public class Esc {

	public static void main(String[] args) {
		
		
	}
}
class A{
	public void display() throws Exception{
		System.out.println("hi");
	}
}

class B extends A{
public void display() throws ArithmeticException{
		System.out.println("bye");
	}
}