package com.cts.training.bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Component;

import javafx.util.converter.LocalDateTimeStringConverter;

@Entity
@Table
@Component
public class IPO implements Serializable{

	private static final long serialVersionUID = 2575561862105094930L;
	@Id
	@GeneratedValue
	private int id;
	private String company_name;
	private String stock_exchange;
	private double price_per_share;
	private int total_shares;
	private LocalDateTime open_date_time;
	private String remarks;
	
	public IPO() {
		
	}

	public IPO(int id, String company_name, String stock_exchange, double price_per_share, int total_shares,
			LocalDateTime open_date_time, String remarks) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.stock_exchange = stock_exchange;
		this.price_per_share = price_per_share;
		this.total_shares = total_shares;
		this.open_date_time = open_date_time;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getStock_exchange() {
		return stock_exchange;
	}

	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}

	public double getPrice_per_share() {
		return price_per_share;
	}

	public void setPrice_per_share(double price_per_share) {
		this.price_per_share = price_per_share;
	}

	public int getTotal_shares() {
		return total_shares;
	}

	public void setTotal_shares(int total_shares) {
		this.total_shares = total_shares;
	}

	public String getOpen_date_time() {//2014-11-16T15:25:33
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd'T'hh:mm:ss");
//		return open_date_time.format(formatter).toString();
		String date=open_date_time.getYear()+"-"+open_date_time.getMonthValue()+"-"+open_date_time.getDayOfMonth()+"T"+
open_date_time.getHour()+":"+open_date_time.getMinute()+":"+open_date_time.getSecond(); 
		return date;
	}

	public void setOpen_date_time(String open_date_time) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'H:m");
		this.open_date_time = LocalDateTime.parse(open_date_time, formatter);
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "IPO [id=" + id + ", company_name=" + company_name + ", stock_exchange=" + stock_exchange
				+ ", price_per_share=" + price_per_share + ", total_shares=" + total_shares + ", open_date_time="
				+ open_date_time + ", remarks=" + remarks + "]";
	}

}
