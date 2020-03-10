package com.cts.training.stockpriceservice.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockPriceByCompanyCode {
	
	private long company_code;
	private List<Integer> stock_prices_per_month;

}
