package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.StockPrice;

public interface StockPriceDAO {
	
	public boolean saveStockPrice(StockPrice stockPrice);
	
	public boolean updateStockPrice(StockPrice stockPrice);
	
	public boolean deleteStockPrice(StockPrice stockPrice);
	
	public StockPrice getStockPriceById(int id);
	
	public List<StockPrice> displayAllStockPrices();

}
