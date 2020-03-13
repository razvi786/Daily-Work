package com.cts.training.stockpriceservice.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cts.training.stockpriceservice.entity.StockPrice;
import com.cts.training.stockpriceservice.model.ImportSummary;
import com.cts.training.stockpriceservice.model.StockPriceOnPeriod;
import com.cts.training.stockpriceservice.repo.StockPriceRepo;

@Service
public class StockPriceServiceImpl implements StockPriceService {

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
	public List<StockPrice> getAll() {
		return stockPriceRepo.findAll();
	}

	@Override
	public StockPrice getById(int id) {
		Optional<StockPrice> se = stockPriceRepo.findById(id);
		return se.orElse(null);
	}

	@Override
	public List<Integer> getPricesByCompanyCode(String companyCode) {
		return stockPriceRepo.getCompanyPricesByCode(companyCode);
	}

	@Override
	public List<StockPriceOnPeriod> getCompanyStockPriceBetween(String companyCode, String stockExchange,
			String startDate, String endDate, String periodicity) {
		return stockPriceRepo.getStockPriceBetweenDates(companyCode, stockExchange, LocalDate.parse(startDate), LocalDate.parse(endDate));
	}
	
	@Override
	public List<StockPriceOnPeriod> getCompanyStockPriceBetweenByMonth(String companyCode, String stockExchange,
			String startDate, String endDate, String periodicity) {
		return stockPriceRepo.getStockPriceBetweenMonths(companyCode, stockExchange, LocalDate.parse(startDate), LocalDate.parse(endDate));
	}
	
	@Override
	public List<StockPriceOnPeriod> getCompanyStockPriceBetweenByYear(String companyCode, String stockExchange,
			String startDate, String endDate, String periodicity) {
		return stockPriceRepo.getStockPriceBetweenYears(companyCode, stockExchange, LocalDate.parse(startDate), LocalDate.parse(endDate));
	}

}
