package com.cts.practise;

public class AnonymousConcrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test(){
			@Override
			public void display() {
				System.out.println("Good Morning");
			}
		};
		Test2 t2=new Test2(){
			@Override
			public void display() {
				System.out.println("Good Evening");
			}
		};
		Test3 t3=new Test3() {
			@Override
			public void display() {
				System.out.println("Good Night");
			}
		};
		t.display();
		t2.display();
		t3.display();

	}

}


class Test{
	public void display()
	{
		System.out.println("Hello");
	}
}

abstract class Test2{
	abstract public void display();
}

interface Test3{
	void display();
}