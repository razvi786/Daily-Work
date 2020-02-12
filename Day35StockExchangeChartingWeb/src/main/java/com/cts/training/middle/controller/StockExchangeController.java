package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.bean.StockExchange;
import com.cts.training.dao.StockExchangeDAO;

@Controller
public class StockExchangeController {
	
	@Autowired
	StockExchangeDAO stockExchangeDAO;
	
	@GetMapping("/stock-exchange-home")
	public String sePage(Model model) {
		List<StockExchange> ses=stockExchangeDAO.displayAllStockExchanges();
		model.addAttribute("list",ses);
		model.addAttribute("se",new StockExchange());
		return "stockExchanges";
	}
	
	@PostMapping("/stock-exchange/save")
	public String addSE(@ModelAttribute("se") StockExchange se) {
		stockExchangeDAO.saveOrUpdateStockExchange(se);
		return "redirect:/stock-exchange-home";
	}
	
	@GetMapping("/stock-exchange/remove/{id}")
	public String removeSE(@PathVariable("id") int id ) {
		StockExchange se=stockExchangeDAO.getStockExchangeById(id);
		stockExchangeDAO.removeStockExchange(se);
		return "redirect:/stock-exchange-home";
	}
	
	@GetMapping("/stock-exchange/update/{id}")
	public String updateStockExchange(Model model,@PathVariable("id") int id) {
		List<StockExchange> ses=stockExchangeDAO.displayAllStockExchanges();
		model.addAttribute("list",ses);
		StockExchange se=stockExchangeDAO.getStockExchangeById(id);
		model.addAttribute("se",se);
		return "stockExchanges";
	}

}
