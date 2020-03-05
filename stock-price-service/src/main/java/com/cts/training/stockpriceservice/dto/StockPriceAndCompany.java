package com.cts.training.stockpriceservice.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class StockPriceAndCompany {
	
	private int id;
	private String company_code;
	private String stock_exchange;
	private double current_price;
	private LocalDate date=LocalDate.now();
	private LocalTime time=LocalTime.now();
	private String name;
	
	public StockPriceAndCompany() {
		
	}
	public StockPriceAndCompany(int id, String company_code, String stock_exchange, double current_price,
			LocalDate date, LocalTime time, String name) {
		super();
		this.id = id;
		this.company_code = company_code;
		this.stock_exchange = stock_exchange;
		this.current_price = current_price;
		this.date = date;
		this.time = time;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public double getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
