package com.cts.training.stockpriceservice;

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
public class StockPriceController {
	
	@Autowired
	StockPriceService stockPriceService;
	
	@GetMapping("/stock-price")
	public ResponseEntity<?> getAllCompanies(){
		List<StockPrice> stockPrices= stockPriceService.getAll();
		if(stockPrices.size()>0) {
			return new ResponseEntity<List<StockPrice>>(stockPrices,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No Stock Prices Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/stock-price/{id}")
	public ResponseEntity<?> getStockPriceById(@PathVariable int id) {
		StockPrice stockPrice=stockPriceService.getById(id);
		if(stockPrice!=null) {
			return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Stock Price Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping("/stock-price")
	public ResponseEntity<?> saveStockPrice(@RequestBody StockPrice sp) {
		StockPrice stockPrice= stockPriceService.insert(sp);
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
	}
	
	@DeleteMapping("/stock-price/{id}")
	public void deleteStockPrice(@PathVariable int id) {
		stockPriceService.remove(id);
	}
	
	@PutMapping("/stock-price")
	public ResponseEntity<?> updateStockPrice(@RequestBody StockPrice sp) {
		StockPrice stockPrice= stockPriceService.update(sp);
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
	}

}
