package com.cts.training.stockexchangeservice;

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

@CrossOrigin(origins = "*")
@RestController
public class StockExchangeController {
	
	@Autowired
	StockExchangeService stockExchangeService;
	
	@GetMapping("/stock-exchange")
	public ResponseEntity<?> getAllCompanies(){
		List<StockExchange> stockExchanges= stockExchangeService.getAll();
		if(stockExchanges.size()>0) {
			return new ResponseEntity<List<StockExchange>>(stockExchanges,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No Stock Exchanges Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/stock-exchange/{id}")
	public ResponseEntity<?> getStockExchangeById(@PathVariable int id) {
		StockExchange stockExchange=stockExchangeService.getById(id);
		if(stockExchange!=null) {
			return new ResponseEntity<StockExchange>(stockExchange,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Stock Exchange Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	
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

}
