package com.cts.work;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		boolean b1 = true;
		boolean b2 = false;
		if ((x == 4) && !b2 )
			System.out.print("1 ");
		System.out.print("2 ");
		if ((b2 = true) && b1 )
			System.out.print("3 ");
	}
}
