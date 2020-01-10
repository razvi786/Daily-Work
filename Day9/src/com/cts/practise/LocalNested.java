package com.cts.practise;

public class LocalNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer=new Outer2();
		Outer2.Inner2 inner=outer.new Inner2();
		inner.display();
	}

}


class Outer2{
	int x=10;
	static int y=20;
	class Inner2{
		public void display() {
			System.out.println(x);
			System.out.println(y);

		}
	}
}