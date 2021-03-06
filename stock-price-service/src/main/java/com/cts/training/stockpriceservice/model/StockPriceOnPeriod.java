package com.cts.training.stockpriceservice.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class StockPriceOnPeriod {
	
	private String companyCode;
	private String stockExchange;
	private String dataPoint; // Day, Month or Year
	private double dataValue; // Average price for that period
	
	public StockPriceOnPeriod() {
		
	}

	public StockPriceOnPeriod(String companyCode, String stockExchange, String dataPoint, double dataValue) {
		super();
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.dataPoint = dataPoint;
		this.dataValue = dataValue;
	}
	
	public StockPriceOnPeriod(String companyCode, String stockExchange, LocalDate dataPoint, double dataValue) {
		super();
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.dataPoint = dataPoint.toString();
		this.dataValue = dataValue;
	}
	
	public StockPriceOnPeriod(String companyCode, String stockExchange, Integer dataPoint, double dataValue) {
		super();
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		if(dataPoint<=31)
			this.dataPoint = Month.of(dataPoint).name();
		else
			this.dataPoint=dataPoint.toString();
		this.dataValue = dataValue;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getDataPoint() {
		return dataPoint;
	}

	public void setDataPoint(String dataPoint) {
		this.dataPoint = dataPoint;
	}

	public double getDataValue() {
		return dataValue;
	}

	public void setDataValue(double dataValue) {
		this.dataValue = dataValue;
	}

	@Override
	public String toString() {
		return "StockPriceOnPeriod [companyCode=" + companyCode + ", stockExchange=" + stockExchange + ", dataPoint="
				+ dataPoint + ", dataValue=" + dataValue + "]";
	}
	
}
