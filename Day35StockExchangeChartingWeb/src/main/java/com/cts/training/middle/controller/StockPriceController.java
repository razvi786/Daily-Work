package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.bean.StockPrice;
import com.cts.training.dao.StockPriceDAO;

@Controller
public class StockPriceController {
	
	@Autowired
	StockPriceDAO stockPriceDAO;
	
	@GetMapping("/stock-price-home")
	public String stockPriceHome(Model model) {
		model.addAttribute("sp",new StockPrice());
		List<StockPrice> list=stockPriceDAO.displayAllStockPrices();
		model.addAttribute("list",list);
		return "stockPrices";
	}
	
	@PostMapping("/stock-price/save")
	public String saveStockPrice(@ModelAttribute("sp") StockPrice sp) {
		stockPriceDAO.saveOrUpdateStockPrice(sp);
		return "redirect:/stock-price-home";
	}
	
	@GetMapping("/stock-price/remove/{id}")
	public String removeStockPrice(@PathVariable("id") int id) {
		StockPrice stockPrice=stockPriceDAO.getStockPriceById(id);
		stockPriceDAO.deleteStockPrice(stockPrice);
		return "redirect:/stock-price-home";
	}
	
	@GetMapping("/stock-price/update/{id}")
	public String updateStockPrice(@PathVariable("id")int id,Model model) {
		List<StockPrice> list=stockPriceDAO.displayAllStockPrices();
		model.addAttribute("list",list);
		StockPrice stockPrice=stockPriceDAO.getStockPriceById(id);
		model.addAttribute("sp",stockPrice);
		return "stockPrices";
	}
	

}
