package com.cts.challenge;

import java.util.Scanner;

public class Courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\t\tCOURSES\t\t");
		System.out.println("1. Java\t\t\t\t5000");
		System.out.println("2. C\t\t\t\t3000");
		System.out.println("3. C++\t\t\t\t2000");
		System.out.println("4. Python\t\t\t10000");
		System.out.println("5. Angular\t\t\t20000");
		System.out.print("Enter Your Choices(Seperated by Space): ");
		String str=new String();
		StringBuffer sb=new StringBuffer();
		
		str=sc.nextLine().toLowerCase();
		
		String choices[]=str.split(" ");
		
		int amount=0;
		int totalAmount=0;

		System.out.println();
		System.out.println("\t\tFINAL PRICE\t\t");
		for(int i=0;i<choices.length;i++) {
			if(choices[i].equalsIgnoreCase("Java")) {
				amount=5000;
				totalAmount+=amount;
			}
			if(choices[i].equalsIgnoreCase("C")) {
				amount=3000;
				totalAmount+=amount;
			}
			if(choices[i].equalsIgnoreCase("C++")) {
				amount=2000;
				totalAmount+=amount;
			}
			if(choices[i].equalsIgnoreCase("Python")) {
				amount=10000;
				totalAmount+=amount;
			}
			if(choices[i].equalsIgnoreCase("Angular")) {
				amount=20000;
				totalAmount+=amount;
			}
			sb.append(choices[i]+"\t\t\t\t"+amount+"\n");
		}
		
		System.out.println(sb);
		System.out.println("Total Price:\t\t\t"+totalAmount);
		
		System.out.println();
		
		int price=0;
		StringBuffer sb2=new StringBuffer();

		System.out.println("\t\tFINAL PRICE\t\t");
		if(str.contains("java")) {
			sb2.append("Java\t\t\t\t5000\n");
			price+=5000;
		}
		if(str.contains("c")) {
			sb2.append("C\t\t\t\t3000\n");
			price+=3000;
		}
		if(str.contains("c++")) {
			sb2.append("C++\t\t\t\t2000\n");
			price+=2000;
		}
		if(str.contains("python")) {
			sb2.append("Python\t\t\t\t10000\n");
			price+=10000;
		}
		if(str.contains("angular")) {
			sb2.append("Angular\t\t\t\t20000\n");
			price+=20000;
		}
		
		System.out.println(sb2);
		System.out.println("Total Price:\t\t\t"+price);
	}

}
