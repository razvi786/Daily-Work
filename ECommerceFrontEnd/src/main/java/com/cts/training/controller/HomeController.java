package com.cts.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.bean.Product;
import com.cts.training.dao.ProductDAO;

@Controller
public class HomeController {
	
	@Autowired
	ProductDAO productDAO;
	
	@GetMapping({"/","home"})
	public String indexPage(Model model) {
		List<Product> products = productDAO.getAllProducts();
		model.addAttribute("list", products);
		return "index";
	}
}