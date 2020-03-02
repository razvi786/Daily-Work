package com.cts.training.stockpriceservice;

import java.util.List;

public interface StockPriceService {
	
	public StockPrice insert(StockPrice stockPrice);
	
	public void remove(int id);
	
	public StockPrice update(StockPrice stockPrice);
	
	public StockPrice getById(int id);
	
	public List<StockPrice> getAll();

}
