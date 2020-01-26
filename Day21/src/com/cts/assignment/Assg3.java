package com.cts.assignment;

import java.util.Scanner;

public class Assg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String ch;
		int c1,c2,c3,a1,a2,a3,total=0;
		
		System.out.println("Do you want to play Quiz?");
		System.out.print("Yes(Y) or No(N): ");
		ch=sc.nextLine();
		
		if(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("yes")) {
			
			System.out.println("Okay, here it comes");
			System.out.println();
			
			//Question 1
			System.out.println("Q1) What is the capital of India?");
			System.out.println("\t1) Delhi");
			System.out.println("\t2) Mumbai");
			System.out.println("\t3) Chennai");
			System.out.print(">");
			a1=1;
			c1=Integer.parseInt(sc.nextLine());
			if(a1==c1) {
				System.out.println("That's Right!");
				total++;
			}else {
				System.out.println("Sorry, Capital of India is Delhi.");
			}
			System.out.println();
				
			//Question 2
			System.out.println("Q2) Can you store value of \"chennai\" in a variable of type char?");
			System.out.println("\t1) Yes");
			System.out.println("\t2) No");
			System.out.print(">");
			a2=2;
			c2=Integer.parseInt(sc.nextLine());
			if(a2==c2) {
				System.out.println("That's Right!");
				total++;
			}else {
				System.out.println("Sorry, \"Chennai\" is a String, characters can only store one character.");
			}
			System.out.println();
			
			//Question 3
			System.out.println("Q3) what is the result of 9+9/3?");
			System.out.println("\t1) 5");
			System.out.println("\t2) 12");
			System.out.println("\t3) 15/3");
			System.out.print(">");
			a3=2;
			c3=Integer.parseInt(sc.nextLine());
			if(a3==c3) {
				System.out.println("That's Right!");
				total++;
			}else {
				System.out.println("Sorry, divide operator has hightest priority, Answer is 12.");
			}
			System.out.println();
			
			System.out.println("your sccore is "+total+" out of 3");
			System.out.println("Thanks for playing!");
			
			
		}else {
			System.out.println("Thank you.");
		}

	}

}
