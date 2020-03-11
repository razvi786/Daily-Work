package com.cts.training.stockexchangeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.stockexchangeservice.entity.StockExchange;
import com.cts.training.stockexchangeservice.service.StockExchangeService;

@CrossOrigin(origins = "*")
@RestController
public class StockExchangeRestController {
	
	@Autowired
	StockExchangeService stockExchangeService;	
	
	@PostMapping("/stock-exchange")
	public ResponseEntity<?> saveStockExchange(@RequestBody StockExchange se) {
		StockExchange stockExchange= stockExchangeService.insert(se);
		return new ResponseEntity<StockExchange>(stockExchange,HttpStatus.OK);
	}
	
	@DeleteMapping("/stock-exchange/{id}")
	public void deleteStockExchange(@PathVariable int id) {
		stockExchangeService.remove(id);
	}
	
	@PutMapping("/stock-exchange")
	public ResponseEntity<?> updateStockExchange(@RequestBody StockExchange se) {
		StockExchange stockExchange= stockExchangeService.update(se);
		return new ResponseEntity<StockExchange>(stockExchange,HttpStatus.OK);
	}
	
	@GetMapping("/stock-exchange")
	public List<StockExchange> getAllStockExchanges(){
		return stockExchangeService.getAll();
	}
	
	@GetMapping("/stock-exchange/{id}")
	public StockExchange getStockExchangeById(@PathVariable int id) {
		return stockExchangeService.getById(id);
	}

}
