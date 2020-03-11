package com.cts.training.stockexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.stockexchangeservice.entity.StockExchange;

public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer>{

}
