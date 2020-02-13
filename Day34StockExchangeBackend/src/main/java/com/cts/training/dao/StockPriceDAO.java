package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.StockPrice;

public interface StockPriceDAO {
	
//	public boolean saveStockPrice(StockPrice stockPrice);
//	
//	public boolean updateStockPrice(StockPrice stockPrice);
	
	public boolean saveOrUpdateStockPrice(StockPrice stockPrice);
	
	public boolean deleteStockPrice(StockPrice stockPrice);
	
	public StockPrice getStockPriceById(int id);
	
	public List<StockPrice> displayAllStockPrices();

}
