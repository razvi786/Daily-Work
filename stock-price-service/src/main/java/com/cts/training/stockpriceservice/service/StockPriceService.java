package com.cts.training.stockpriceservice.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cts.training.stockpriceservice.entity.StockPrice;
import com.cts.training.stockpriceservice.model.ImportSummary;
import com.cts.training.stockpriceservice.model.StockPriceOnPeriod;

public interface StockPriceService {
	
	public StockPrice insert(StockPrice stockPrice);
	
	public void remove(int id);
	
	public StockPrice update(StockPrice stockPrice);
	
	public List<StockPrice> getAll();
	
	public StockPrice getById(int id);
	
	public List<Integer> getPricesByCompanyCode(String companyCode);

	public List<StockPriceOnPeriod> getCompanyStockPriceBetween(String companyCode, String stockExchange, String startDate,
			String endDate, String periodicity);

	public List<StockPriceOnPeriod> getCompanyStockPriceBetweenByMonth(String companyCode, String stockExchange,
			String startDate, String endDate, String periodicity);

	public List<StockPriceOnPeriod> getCompanyStockPriceBetweenByYear(String companyCode, String stockExchange,
			String startDate, String endDate, String periodicity);

}
