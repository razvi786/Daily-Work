package com.cts.assignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateTime {
	
	static void difference(String a,String b) {
		
		String start[]=new String[3];
		start=a.split("/");
		int d1=Integer.parseInt(start[0]);
		int m1=Integer.parseInt(start[1]);
		int y1=Integer.parseInt(start[2]);
		
		String end[]=new String[3];
		end=b.split("/");
		int d2=Integer.parseInt(end[0]);
		int m2=Integer.parseInt(end[1]);
		int y2=Integer.parseInt(end[2]);
		
		LocalDate first=LocalDate.of(y1, m1, d1);
		LocalDate last=LocalDate.of(y2, m2, d2);
		
		Period period=Period.between(first, last);
		
		System.out.println(period.getDays()+" Days "+period.getMonths()+" Months "+period.getYears()+" Years.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Start Date(dd/mm/yyyy): ");
		String start=sc.nextLine();
		System.out.print("Enter End Date(dd/mm/yyyy): ");
		String end=sc.nextLine();
		
		System.out.print("Period Between 2 dates: ");
		difference(start,end);

		
	}

}
