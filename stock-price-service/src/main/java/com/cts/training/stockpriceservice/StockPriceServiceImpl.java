package com.cts.training.stockpriceservice;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StockPriceServiceImpl implements StockPriceService{
	
	@Autowired
	StockPriceRepo stockPriceRepo;

	@Override
	public StockPrice insert(StockPrice stockPrice) {
		return stockPriceRepo.save(stockPrice);
	}

	@Override
	public void remove(int id) {
		stockPriceRepo.deleteById(id);
	}

	@Override
	public StockPrice update(StockPrice stockPrice) {
		return stockPriceRepo.save(stockPrice);
	}

	@Override
	public StockPrice getById(int id) {
		Optional<StockPrice> se=stockPriceRepo.findById(id);
		return se.orElse(null);
	}

	@Override
	public List<StockPrice> getAll() {
		return stockPriceRepo.findAll();
	}

	@Override
	public ImportSummary addStockPricesFromExcelSheet(MultipartFile file) throws IOException,Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
