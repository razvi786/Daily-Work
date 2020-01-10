package com.cts.practise;

public class MethodNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer3 o=new Outer3();
		o.display();
	}

}

class Outer3{
	int x=10;
	static int y=20;
	public void display() {
		class Inner3{
			public void show() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner3 i=new Inner3();
		i.show();
	}
}