package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.bean.Company;
import com.cts.training.bean.StockExchange;
import com.cts.training.bean.User;
import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.dao.UserDAO;

@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private CompanyDAO companyDAO;
	
	@Autowired
	private StockExchangeDAO stockExchangeDAO;
	
	//Any one of the two
	//@RequestMapping("/")
	@GetMapping("/") // new feature In version 4.3
	public String indexPage(Model model) {
		model.addAttribute("message","Welcome to Spring MVC");
//		List<String> names=new ArrayList<String>();
//		addNames(names);	
//		model.addAttribute("list",names);
		
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list",users);

		
		return "index";
	}
	
	@GetMapping("companies") // new feature In version 4.3
	public String companyPage(Model model) {
		
		List<Company> companies=companyDAO.getAllCompanies();
		model.addAttribute("list",companies);

		return "companies";
	}
	
	@GetMapping("stockExchanges") // new feature In version 4.3
	public String stockExchangesPage(Model model) {
		
		List<StockExchange> ses=stockExchangeDAO.displayAllStockExchanges();
		model.addAttribute("list",ses);

		return "stockExchanges";
	}

	private void addNames(List<String> names) {
		names.add("Kauser");
		names.add("Dubai");
		names.add("Teddy Day");
		names.add("Chocolate Day");
	}
	
}
