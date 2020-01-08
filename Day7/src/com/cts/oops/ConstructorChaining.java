package com.cts.oops;

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj=new A();
//		A obj=new A(10);
//		B b1=new B();
		B b2=new B(2,3);
	}

}

class A{
	
	A(){
//		this(5);
		System.out.println("1");
	}
	A(int a){
		this();
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
}
class B extends A{
	
	B(){
		super(10);
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
	B(int x,int y){
		super(20);
		System.out.println("6");
	}
}
