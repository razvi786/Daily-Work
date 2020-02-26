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

import com.cts.project.bean.StockPrice;
import com.cts.project.repo.StockPriceRepo;

@CrossOrigin(origins = "*")
@RestController
public class StockPriceController {

	@Autowired
	StockPriceRepo stockPriceRepo;
	
	@GetMapping("/stock-price")
	public List<StockPrice> getAllStockPrices(){
		return stockPriceRepo.findAll();
	}
	
	@GetMapping("/stock-price/{id}")
	public StockPrice getStockPriceById(@PathVariable int id) {
		Optional<StockPrice> sp=stockPriceRepo.findById(id);
		StockPrice stockPrice=sp.get();
		return stockPrice;
	}
	
	@PostMapping("/stock-price")
	public StockPrice saveStockPrice(@RequestBody StockPrice sp) {
		StockPrice stockPrice=stockPriceRepo.save(sp);
		return stockPrice;
	}
	
	@DeleteMapping("/stock-price/{id}")
	public void deleteStockPrice(@PathVariable int id) {
		stockPriceRepo.deleteById(id);
	}
	
	@PutMapping("/stock-price")
	public StockPrice updateStockPrice(@RequestBody StockPrice sp) {
		StockPrice stockPrice=stockPriceRepo.save(sp);
		return stockPrice;
	}
	
}
