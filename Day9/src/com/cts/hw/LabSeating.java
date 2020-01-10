//There are 3 labs in the CSE department(L1, L2 and L3) with different seating capacities. A single lab needs to be allocated to a class of 'n' students. The labs need to be utilized to the maximum i.e the number of systems that are not being used should be minimal. Which lab needs to be allocated to this class? 
//The input consists of four numbers separated by comma where first three are seating capacity of Labs L1,L2 and L3 and fourth input is number of trainees.  
//If more than one lab satisfies the condition, print all the labs. If none of the lab satisfies the condition, print "No labs" 
//Sample Input1 
//30,40,20,25  
//Sample Output1 
//Lab - L1  
//Sample Input2 
//30,30,30,25  
//Sample Output2 
//Lab - L1,L2,L3  
//Sample Input3 
//40,30,40,55  
//Sample Output3 
//No labs  

package com.cts.hw;

import java.util.Scanner;

public class LabSeating {
	
	//function to check whether x is less than y (only if they are positive)
	public static boolean isLess(int x, int y) {
		if(x>=0 && y>=0) { //if both are potitive
			if(x<=y)
				return true;
			else
				return false;
		}else if(y<0) //y is negative
			return true;
		else //x is negative
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		
		System.out.print("Give Input (L1 L2 L3 S): ");
		String str=sc.nextLine();
		String inputs[]=str.split(" ");
		
		int lab1=Integer.parseInt(inputs[0]);

		int lab2=Integer.parseInt(inputs[1]);

		int lab3=Integer.parseInt(inputs[2]);

		int s=Integer.parseInt(inputs[3]);
		
		int l1=lab1-s; //computers remaining in lab 1
		
		int l2=lab2-s; //computers remaining in lab 2
		
		int l3=lab3-s; //computers remaining in lab 3
		
		if(l1<0 && l2<0 && l3<0) {
			sb.append("No Labs ");
		}else {
			sb.append("Lab -");
			if(l1>=0 && isLess(l1,l2) && isLess(l1,l3))
				sb.append(" L1,");
			if(l2>=0 && isLess(l2,l1) && isLess(l2,l3))
				sb.append(" L2,");
			if(l3>=0 && isLess(l3,l1) && isLess(l3,l2))
				sb.append(" L3,");
		}
		
		sb.deleteCharAt(sb.length()-1); //deleting last comma
		
		System.out.println(sb);

		sc.close();
	}

}
