package com.cts.training.stockpriceservice;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.training.stockpriceservice.dto.StockPriceAndCompany;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer>{
	
	@Query("SELECT avg(current_price) FROM StockPrice WHERE company_code=?1 group by month(date)")
	public List<Integer> getCompanyPricesByCode(String companycode); 

}
