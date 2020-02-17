package com.cts.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}
	
	@GetMapping("/manage-users")
	public String manageUsers() {
		return "manage-users";
	}
	
	@GetMapping("/manage-categories")
	public String manageCategories() {
		return "manage-categories";
	}
	
	@GetMapping("/manage-products")
	public String manageProducts() {
		return "manage-products";
	}
	
	@GetMapping("/manage-suppliers")
	public String manage_suppliers() {
		return "manage-users";
	}

}
