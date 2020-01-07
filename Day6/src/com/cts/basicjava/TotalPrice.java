package com.cts.basicjava;

public class TotalPrice {

	public int price(String pname, int quantity) {

		int price = 0;

		int itemPrice;

		if (pname.equals("Pen"))
			itemPrice = 5;
		else if (pname.equals("Book"))
			itemPrice = 20;
		else if (pname.equals("Watch"))
			itemPrice = 100;
		else
			itemPrice = 0;

		price = itemPrice * quantity;

		return price;
	}

}
