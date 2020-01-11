package com.cts.map;

import java.util.Comparator;

public class Employee {

	private int id;
	private String name;
	private String address;
	private int age;
	private long phone;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String address, int age, long phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone
//				+ ", salary=" + salary + "]";
		
		return id+" : "+name+" : "+address+" : "+age+" : "+phone+" : "+salary;
	}
	
//	@Override
//	public int compareTo(Employee emp) {
//		
//		if(this.id>emp.id) {
//			return -1;
//		}else if(this.id==emp.id) {
//			return 0;
//		}else {
//			return 1;
//		}
//	}
	
	
}

class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getId()<o2.getId()) {
			return -1;
		}else if(o1.getId()==o2.getId()) {
			return 0;
		}else {
			return 1;
		}
	}
	
}

class SortByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {

		if(o1.getAge()>o2.getAge()) {
			return 1;
		}else if(o1.getAge()==o2.getAge()) {
			return 0;
		}else {
			return -1;
		}
	}
	
	
}

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}