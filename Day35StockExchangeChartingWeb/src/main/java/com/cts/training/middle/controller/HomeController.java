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
	
	@GetMapping({"/","/home"})
	public String homePage(Model model) {
		String welcome="Welcome to Stock Market Charting";
		model.addAttribute("message",welcome);
		return "index";
	}
	
}
