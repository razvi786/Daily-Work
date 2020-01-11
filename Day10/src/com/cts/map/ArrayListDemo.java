package com.cts.map;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		Employee emp1=new Employee(101, "Syed", "Hyderabad", 22, 123456, 50000);
		Employee emp2=new Employee(103, "Ehsan", "Telangana", 21, 1234567, 60000);
		Employee emp3=new Employee(102, "Ali", "Yakutpura", 20, 12345678, 70000);
		Employee emp4=new Employee(104, "Razvi", "charmianr", 19, 123456789, 80000);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
//		SortById sid=new SortById();
//		Collections.sort(list,sid);
		
		Collections.sort(list,new SortById());
		
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println();
		
		Collections.sort(list,new SortByAge());
		
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println();
		
		Collections.sort(list,new SortByName());
		
		for(Employee e: list) {
			System.out.println(e);
		}

	}

}
