package com.cts.activity.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StockPrice implements Serializable{

	private static final long serialVersionUID = 2418334347026050569L;
	@Id
	private int company_id;
	private String stock_exchange;
	private double current_price;
	private LocalDate date;
	private LocalTime time;
	
	public StockPrice() {
		
	}

	public StockPrice(int company_id, String stock_exchange, double current_price, LocalDate date, LocalTime time) {
		super();
		this.company_id = company_id;
		this.stock_exchange = stock_exchange;
		this.current_price = current_price;
		this.date = date;
		this.time = time;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
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

	@Override
	public String toString() {
		return "StockPrice [company_id=" + company_id + ", stock_exchange=" + stock_exchange + ", current_price="
				+ current_price + ", date=" + date + ", time=" + time + "]";
	}

}
