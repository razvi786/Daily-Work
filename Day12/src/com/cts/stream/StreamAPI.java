package com.cts.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=new ArrayList<String>();
		addNames(names);
		
		names.forEach(System.out::println);
		
		List<String> lengthScale=names.stream().filter(name->name.length()>5).collect(Collectors.toList());
		System.out.println("Length Greater Than 5");
		lengthScale.forEach(System.out::println);
		
		List<String> allCaps=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println("All Uppercase");
		allCaps.forEach(System.out::println);
		
		List<Employee> employees=new ArrayList<Employee>();
		addEmployees(employees);
		employees.forEach(System.out::println);
		
		List<Employee> lessAge=employees.stream().filter(emp -> emp.getAge()<22 && emp.getAddress().equals("Telangana")).collect(Collectors.toList());
		System.out.println("Age Less Than 22");
		lessAge.forEach(System.out::println);
		
		List<Employee> nameGreat=employees.stream().filter(emp -> emp.getName().length()>5).collect(Collectors.toList());
		System.out.println("Name Greater Than 5");
		nameGreat.forEach(System.out::println);
		
		List<Employee> increaseSalary=employees.stream().map(emp -> {emp.setSalary(emp.getSalary()*1.1); return emp;}).collect(Collectors.toList());
		System.out.println("Salary Increased 10 Percent: ");
		increaseSalary.forEach(System.out::println);
		
		List<Employee> age22=employees.stream().filter(emp->emp.getAge()==22).collect(Collectors.toList());
		System.out.println("Age 22:");
		age22.forEach(System.out::println);
				
	}

	private static void addNames(List<String> names) {
		// TODO Auto-generated method stub
		
		names.add("Yasmin");
		names.add("Syed");
		names.add("Pankaj");
		names.add("XYZ");
		
	}
	
	private static void addEmployees(List<Employee> employees) {
		Employee emp1=new Employee(101, "Syed", "Hyderabad", 22, 123456, 50000);
		Employee emp2=new Employee(102, "Ehsan", "Telangana", 21, 1234567, 60000);
		Employee emp3=new Employee(103, "Ali", "Andhra", 20, 87659, 260000);
		Employee emp4=new Employee(104, "Razviiii", "Kerala", 26, 75308, 670000);
		Employee emp5=new Employee(105, "Hmmmmmmm", "Mars", 30000, 1, 10000000);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}
	
	

}
