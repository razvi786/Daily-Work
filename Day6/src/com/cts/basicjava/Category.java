package com.cts.basicjava;

public class Category {
	
	public String category(int age) {
		if(age>=5 && age <=12)
			return "Children";
		else if(age>=12 && age<=19)
			return "Teenagers";
		else if(age>=20 && age<=35)
			return "Young adults";
		else if(age>=36 && age<=45)
			return "Mature Adults";
		else if(age>=46 && age<=55)
			return "Elders";
		else if(age>=56)
			return "Seniors";
		else
			return "Enter correct age";	
		
	}

}
