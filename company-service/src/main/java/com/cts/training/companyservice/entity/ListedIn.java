package com.cts.training.companyservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class ListedIn {
	
	@Id
	@GeneratedValue
	private int id;
	private String stockExchangeName;
	private String stockCode;

	public ListedIn() {
		
	}

	public ListedIn(int id, String stockExchangeName, String stockCode) {
		super();
		this.id = id;
		this.stockExchangeName = stockExchangeName;
		this.stockCode = stockCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Override
	public String toString() {
		return "ListedIn [id=" + id + ", stockExchangeName=" + stockExchangeName + ", stockCode=" + stockCode + "]";
	}	
	
}
