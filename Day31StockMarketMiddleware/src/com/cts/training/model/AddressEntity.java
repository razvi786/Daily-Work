package com.cts.training.model;

public class AddressEntity {
	
	private int id;
	private String houseNo;
	private String street;
	private String city;
	private String state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state="
				+ state + "]";
	}
	
	

}
