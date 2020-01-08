package com.cts.oops;

public class FinalAttribute {
	
	final double PI;
	
	FinalAttribute(){
		PI=4.5;
	}
	
	FinalAttribute(int a){
		PI=5.5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  final double PIE;
//		  PIE=100;
//		  PIE=101;
//		  System.out.println(PIE);
			FinalAttribute f1=new FinalAttribute();
			System.out.println(f1.PI);
		
			FinalAttribute f2=new FinalAttribute();
			System.out.println(f2.PI);
	}

}
