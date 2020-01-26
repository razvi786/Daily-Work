//Java Program to Convert Character to String and Vice-Versa

package com.cts.practise;

public class CharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Character to String
		char name[]=new char[] {'S','Y','E','D'};
		//Method-1
		String myName=new String(name);
		System.out.println(myName);
		//Method-2
		String myName2;
		myName2=String.valueOf(name);
		System.out.println(myName2);
		
		//String to Char
		String lastName="RAZVI";
		char nameArray[]=lastName.toCharArray();
		for(int i=0;i<nameArray.length;i++) {
			System.out.print("'"+nameArray[i]+"' ");
		}

	}

}
