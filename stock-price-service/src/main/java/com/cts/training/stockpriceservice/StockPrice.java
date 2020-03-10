package com.cts.training.stockpriceservice;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "stock_prices")
@Component
@Data
@AllArgsConstructor
public class StockPrice implements Serializable{
	
	private static final long serialVersionUID = 2418334347026050569L;
	@Id
	@GeneratedValue
	private int id;
	private String company_code;
	private String stock_exchange;
	private double current_price;
	private LocalDate date;
	private LocalTime time;
	@Override
	public String toString() {
		return "StockPrice [id=" + id + ", company_code=" + company_code + ", stock_exchange=" + stock_exchange
				+ ", current_price=" + current_price + ", date=" + date + ", time=" + time + "]";
	}
	
	

}
