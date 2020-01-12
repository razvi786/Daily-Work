package com.cts.activity.bean;

public class Employee {
	
	//data members
	private int id;
	private String name;
	private String address;
	private int age;
	private long phone;
	private double salary;
	
	//getter and setter methods
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
	
	//constructor
	public Employee(int id, String name, String address, int age, long phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
	}
	
	//toString() to display output whenever the object of Employee is called in System.out.println()
	@Override
	public String toString() {
		return id+" : "+name+" : "+address+" : "+age+" : "+phone+" : "+salary;
	}

}
