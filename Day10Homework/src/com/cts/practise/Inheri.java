package com.cts.practise;

public class Inheri {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.x);
	}
}
class A{
	int x=10;
}
class B extends A{
	int x=20;
}
