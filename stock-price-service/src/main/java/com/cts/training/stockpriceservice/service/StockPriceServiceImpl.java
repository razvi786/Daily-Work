package com.cts.training.stockpriceservice.service;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	
	@Override
	public ImportSummary addStockPricesFromExcelSheet(MultipartFile file) throws Exception {
		InputStream in=file.getInputStream();
		int currentRowNum=1;
		int currentCellNum=0;
		LocalDate startDate=LocalDate.MAX;
		LocalDate endDate=LocalDate.MIN;
		List<String> duplicates = new ArrayList<String>();
		List<StockPrice> stockPricesEntities = new ArrayList<StockPrice>();
		Set<String> companyCodes = new HashSet<String>();
		Set<String> stockExchanges = new HashSet<String>();
		if (file.getOriginalFilename().endsWith(".xls")) {
			try (HSSFWorkbook workbook = new HSSFWorkbook(in)) {
				HSSFSheet stockPricesSheet = workbook.getSheetAt(0);
				HSSFRow row = stockPricesSheet.getRow(currentRowNum);
				while (row != null && row.getCell(0) != null) {
					String companyCode = row.getCell(currentCellNum++).getStringCellValue().trim();
					String stockExchangeName = row.getCell(currentCellNum++).getStringCellValue().trim();
					int stockPrice = (int) row.getCell(currentCellNum++).getNumericCellValue();
					companyCodes.add(companyCode);
					stockExchanges.add(stockExchangeName);
					LocalDate date = row.getCell(currentCellNum++).getDateCellValue()
							.toInstant()
							.atZone(ZoneId.of("+05:30"))
							.toLocalDate();
					startDate = date.isBefore(startDate) ? date : startDate;
					endDate = date.isAfter(endDate) ? date : endDate;
					LocalTime time = row.getCell(currentCellNum++).getDateCellValue()
							.toInstant()
							.atZone(ZoneId.of("+05:30"))
							.toLocalTime();
					if (!stockPriceRepo.getIfAlreadyExists(companyCode, stockExchangeName, date, time).isPresent()) {
						StockPrice stockPriceEntity = new StockPrice(companyCode, stockExchangeName, stockPrice, date, time);
						stockPricesEntities.add(stockPriceEntity);
					} else {
						duplicates.add("The record at row " + (currentRowNum + 1) + " is duplicate.");
					}
					row = stockPricesSheet.getRow(++currentRowNum);
					currentCellNum = 0;
				}
			} catch (NullPointerException e) {
				throw new Exception("The file has some missing value at " + (currentRowNum + 1) + ":" + (currentCellNum)
						+ " (row:column). ");
			} catch (IllegalStateException e) {
				throw new Exception("The file has some wrong value at " + (currentRowNum + 1) + ":" + (currentCellNum)
						+ " (row:column). ");
			} catch (DateTimeParseException e) {
				throw new Exception("The file has wrong date/time format value at " + (currentRowNum + 1) + ":"
						+ (currentCellNum) + " (row:column). ");
			}
		} else if (file.getOriginalFilename().endsWith(".xlsx")) {
			try (XSSFWorkbook workbook = new XSSFWorkbook(in)) {
				XSSFSheet stockPricesSheet = workbook.getSheetAt(0);
				System.out.println(stockPricesSheet.getLastRowNum());
				XSSFRow row = stockPricesSheet.getRow(currentRowNum);
				while (row != null && row.getCell(0) != null) {
					String companyCode = row.getCell(currentCellNum++).getStringCellValue().trim();
					companyCode = companyCode.trim();
					String stockExchangeName = row.getCell(currentCellNum++).getStringCellValue().trim();
					int stockPrice = (int) row.getCell(currentCellNum++).getNumericCellValue();
					companyCodes.add(companyCode);
					stockExchanges.add(stockExchangeName);
					LocalDate date = row.getCell(currentCellNum++).getDateCellValue().toInstant()
							.atZone(ZoneId.of("+05:30")).toLocalDate();
					startDate = date.isBefore(startDate) ? date : startDate;
					endDate = date.isAfter(endDate) ? date : endDate;
					LocalTime time = row.getCell(currentCellNum++).getDateCellValue()
							.toInstant()
							.atZone(ZoneId.of("+05:30"))
							.toLocalTime();
					if (!stockPriceRepo.getIfAlreadyExists(companyCode, stockExchangeName, date, time).isPresent()) {
						StockPrice stockPriceEntity = new StockPrice(companyCode, stockExchangeName,
								stockPrice, date, time);
						stockPricesEntities.add(stockPriceEntity);
					} else {
						duplicates.add("The record at row " + (currentRowNum + 1) + " is duplicate.");
					}
					row = stockPricesSheet.getRow(++currentRowNum);
					currentCellNum = 0;
				}
			} catch (NullPointerException e) {
				throw new Exception("The file has some missing value at " + (currentRowNum + 1) + ":" + (currentCellNum)
						+ " (row:column). ");
			} catch (IllegalStateException e) {
				throw new Exception("The file has some wrong value at " + (currentRowNum + 1) + ":" + (currentCellNum)
						+ " (row:column). ");
			} catch (DateTimeParseException e) {
				throw new Exception("The file has wrong date/time format value at " + (currentRowNum + 1) + ":"
						+ (currentCellNum) + " (row:column). ");
			}
		}
		stockPriceRepo.saveAll(stockPricesEntities);
		return new ImportSummary(stockPricesEntities.size(), startDate, endDate, companyCodes, stockExchanges,
				duplicates);
	}

}
