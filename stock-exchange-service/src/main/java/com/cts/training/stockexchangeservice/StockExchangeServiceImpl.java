package com.cts.training.stockexchangeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{
	
	@Autowired
	StockExchangeRepo stockExchangeRepo;

	@Override
	public StockExchange insert(StockExchange stockExchange) {
		return stockExchangeRepo.save(stockExchange);
	}

	@Override
	public void remove(int id) {
		stockExchangeRepo.deleteById(id);
	}

	@Override
	public StockExchange update(StockExchange stockExchange) {
		return stockExchangeRepo.save(stockExchange);
	}

	@Override
	public StockExchange getById(int id) {
		Optional<StockExchange> se=stockExchangeRepo.findById(id);
		return se.orElse(null);
	}

	@Override
	public List<StockExchange> getAll() {
		return stockExchangeRepo.findAll();
	}
	
}
