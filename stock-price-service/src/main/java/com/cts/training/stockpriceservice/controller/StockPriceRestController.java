package com.cts.training.stockpriceservice.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cts.training.stockpriceservice.entity.StockPrice;
import com.cts.training.stockpriceservice.model.ImportSummary;
import com.cts.training.stockpriceservice.model.StockPriceOnPeriod;
import com.cts.training.stockpriceservice.service.StockPriceService;

@CrossOrigin(origins = "*")
@RestController
public class StockPriceRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StockPriceService stockPriceService;

	@PostMapping("/stock-price")
	public ResponseEntity<?> saveStockPrice(@RequestBody StockPrice sp) {
		StockPrice stockPrice = stockPriceService.insert(sp);
		return new ResponseEntity<StockPrice>(stockPrice, HttpStatus.OK);
	}

	@DeleteMapping("/stock-price/{id}")
	public void deleteStockPrice(@PathVariable int id) {
		stockPriceService.remove(id);
	}

	@PutMapping("/stock-price")
	public ResponseEntity<?> updateStockPrice(@RequestBody StockPrice sp) {
		StockPrice stockPrice = stockPriceService.update(sp);
		return new ResponseEntity<StockPrice>(stockPrice, HttpStatus.OK);
	}
	
	@GetMapping("/stock-price")
	public ResponseEntity<?> getAllStockPrices() {
		List<StockPrice> stockPrices = stockPriceService.getAll();
		if (stockPrices.size() > 0) {
			return new ResponseEntity<List<StockPrice>>(stockPrices, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("No Stock Prices Found", HttpStatus.OK);
		}
	}

	@GetMapping("/stock-price/{id}")
	public StockPrice getStockPriceById(@PathVariable int id) {
		return stockPriceService.getById(id);
	}
	
	@GetMapping("/stock-price/chart/{company_code}")
	public ResponseEntity<?> getStockPricesByCompanyCode(@PathVariable String company_code){
		List<Integer> stocks=stockPriceService.getPricesByCompanyCode(company_code);
		return new ResponseEntity<List<Integer>>(stocks,HttpStatus.OK);
	}
	
	@GetMapping("/stock-price/companyStockPriceBetween/{companyCode}/{stockExchange}/{startDate}/{endDate}/{periodicity}")
	public List<StockPriceOnPeriod> getCompanyStockPriceBetweenDays(@PathVariable String companyCode,
			@PathVariable String stockExchange, @PathVariable LocalDate startDate, @PathVariable LocalDate endDate,
			@PathVariable String periodicity){
		return stockPriceService.getCompanyStockPriceBetween(companyCode, stockExchange, startDate, endDate, periodicity);
	}

//	@PostMapping(value = "/stock-price/upload-stock-sheet", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public ResponseEntity<?> uploadStockSheet(@RequestParam("stocksSheet") MultipartFile file) {
//		logger.info("File received: {}", file.getOriginalFilename());
//		if (file.getOriginalFilename().endsWith(".xls") || file.getOriginalFilename().endsWith(".xlsx")) {
//			try {
//				return new ResponseEntity<ImportSummary>(stockPriceService.addStockPricesFromExcelSheet(file),
//						HttpStatus.OK);
//			} catch (IOException e) {
//				e.printStackTrace();
//				return new ResponseEntity<String>("Error Reading File", HttpStatus.BAD_REQUEST);
//			} catch (Exception e) {
//				e.printStackTrace();
//				return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
//			}
//		} else {
//			return new ResponseEntity<String>("Wrong file Extension. (Only .xls or .xlsx allowed.)",
//					HttpStatus.BAD_REQUEST);
//		}
//	}	

}
