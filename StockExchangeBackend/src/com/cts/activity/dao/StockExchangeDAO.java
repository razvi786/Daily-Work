package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.StockExchange;

public interface StockExchangeDAO {
	
	public boolean saveStockExchange(StockExchange stockExchange);
	
	public boolean updateStockExchange(StockExchange stockExchange);
	
	public boolean removeStockExchange(StockExchange stockExchange);
	
	public StockExchange getStockExchangeById(int id);
	
	public List<StockExchange> displayAllStockExchanges();

}
