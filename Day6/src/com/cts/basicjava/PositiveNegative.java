package com.cts.basicjava;

import java.util.Scanner;

public class PositiveNegative {

	public String isPositive(int n) {
		
		if(n<0)
			return "Negative";
		else if(n>0)
			return "Positive";
		else
			return "Neither Positive nor Negative";
				
	}

}
