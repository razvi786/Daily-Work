package com.cts.training.stockpriceservice.repo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.training.stockpriceservice.entity.StockPrice;
import com.cts.training.stockpriceservice.model.StockPriceOnPeriod;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer>{
	
	@Query("SELECT avg(current_price) FROM StockPrice WHERE company_code=?1 group by month(date)")
	public List<Integer> getCompanyPricesByCode(String companycode); 

	@Query("SELECT new com.cts.training.stockpriceservice.model.StockPriceOnPeriod(company_code,stock_exchange,date,AVG(current_price))"
			+ " FROM StockPrice"
			+ " WHERE company_code=?1 AND stock_exchange=?2 AND date BETWEEN ?3 AND ?4"
			+ " GROUP BY date")
	public List<StockPriceOnPeriod> getStockPriceBetweenDates(String companyCode, String stockExchange, LocalDate startDate, LocalDate endDate);
	
	@Query("SELECT new com.cts.training.stockpriceservice.model.StockPriceOnPeriod(company_code,stock_exchange,month(date),AVG(current_price))"
			+ " FROM StockPrice"
			+ " WHERE company_code=?1 AND stock_exchange=?2 AND date BETWEEN ?3 AND ?4"
			+ " GROUP BY month(date)")
	public List<StockPriceOnPeriod> getStockPriceBetweenMonths(String companyCode, String stockExchange, LocalDate startDate, LocalDate endDate);
	
	@Query("SELECT new com.cts.training.stockpriceservice.model.StockPriceOnPeriod(company_code,stock_exchange,year(date),AVG(current_price))"
			+ " FROM StockPrice"
			+ " WHERE company_code=?1 AND stock_exchange=?2 AND date BETWEEN ?3 AND ?4"
			+ " GROUP BY year(date)")
	public List<StockPriceOnPeriod> getStockPriceBetweenYears(String companyCode, String stockExchange, LocalDate startDate, LocalDate endDate);
	
	@Query("From StockPrice where company_code =?1 and stock_exchange=?2 and date=?3 and time=?4 ")
	public Optional<StockPrice> getIfAlreadyExists(String companyCode,String stockExchange,LocalDate date,LocalTime time);
	
}
