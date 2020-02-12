package com.cts.training.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.StockExchange;
import com.cts.training.dao.StockExchangeDAO;

public class StockExchangeUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static StockExchangeDAO stockExchangeDAO;
	private static StockExchange se;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		se=(StockExchange)context.getBean("stockExchange");
		stockExchangeDAO=(StockExchangeDAO)context.getBean("stockExchangeDAO");
	}
	
//	@Test
//	public void test_add_stockexchange() {
//		StockExchange se=new StockExchange(149, "NSE", "Nagasri Stock Exchange", "India", "Very Bad");
//		assertEquals(true, stockExchangeDAO.saveStockExchange(se));
//	}
	
	

}
