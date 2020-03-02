package com.cts.training.stockexchangeservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class StockExchange implements Serializable{

	private static final long serialVersionUID = 7636199702245731098L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String brief;
	private String address;
	private String remarks;
	
	public StockExchange() {
		
	}

	public StockExchange(int id, String name, String brief, String address, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
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

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", name=" + name + ", brief=" + brief + ", address=" + address + ", remarks="
				+ remarks + "]";
	}
	
	

}
