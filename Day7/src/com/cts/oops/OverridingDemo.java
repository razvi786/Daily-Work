package com.cts.oops;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static binding
		Animal a=new Animal();
		a.eat();
		
		//Dynamic Binding
		a=new Tiger();
		a.eat();
		
	}

}

class Animal{
	
	public void eat() {
		System.out.println("Animal Eats");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger Eats");
	}
}

