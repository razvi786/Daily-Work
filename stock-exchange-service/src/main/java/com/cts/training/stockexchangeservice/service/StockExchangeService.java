package com.cts.training.stockexchangeservice.service;

import java.util.List;

import com.cts.training.stockexchangeservice.entity.StockExchange;

public interface StockExchangeService {
	
	public StockExchange insert(StockExchange stockExchange);
	
	public void remove(int id);
	
	public StockExchange update(StockExchange stockExchange);
	
	public List<StockExchange> getAll();
	
	public StockExchange getById(int id);

}
