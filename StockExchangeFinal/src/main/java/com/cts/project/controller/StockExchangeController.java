package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.StockExchange;
import com.cts.project.repo.StockExchangeRepo;

@CrossOrigin(origins = "*")
@RestController
public class StockExchangeController {
	
	@Autowired
	StockExchangeRepo stockExchangeRepo;
	
	@GetMapping("/stock-exchange")
	public List<StockExchange> getAllStockExchanges(){
		return stockExchangeRepo.findAll();
	}
	
	@GetMapping("/stock-exchange/{id}")
	public StockExchange getStockExchangeById(@PathVariable int id) {
		Optional<StockExchange> se=stockExchangeRepo.findById(id);
		StockExchange stockExchange=se.get();
		return stockExchange;
	}
	
	@PostMapping("/stock-exchange")
	public StockExchange saveStockExchange(@RequestBody StockExchange se) {
		StockExchange stockExchange=stockExchangeRepo.save(se);
		return stockExchange;
	}
	
	@DeleteMapping("/stock-exchange/{id}")
	public void deleteStockExchange(@PathVariable int id) {
		stockExchangeRepo.deleteById(id);
	}
	
	@PutMapping("/stock-exchange")
	public StockExchange updateStockExchange(@RequestBody StockExchange se) {
		StockExchange stockExchange=stockExchangeRepo.save(se);
		return stockExchange;
	}

}
