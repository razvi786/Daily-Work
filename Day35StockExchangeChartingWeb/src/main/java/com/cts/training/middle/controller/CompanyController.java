package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.bean.Company;
import com.cts.training.dao.CompanyDAO;

@Controller
public class CompanyController {
	
	@Autowired
	CompanyDAO companyDAO;
	
	@GetMapping("/company-home")
	public String companyPage(Model model) {
		List<Company> companies=companyDAO.getAllCompanies();
		model.addAttribute("list",companies);
		model.addAttribute("company",new Company());
		return "companies";
	}
	
	@PostMapping("/company/save")
	public String addCompany(@ModelAttribute("company") Company company) {
		companyDAO.saveOrUpdateCompany(company);
		return "redirect:/company-home";
	}
	
	@GetMapping("/company/remove/{id}")
	public String removeCompany(@PathVariable("id") int id) {
		Company company=companyDAO.getCompanyById(id);
		companyDAO.removeCompany(company);
		return "redirect:/company-home";
	}
	
	@GetMapping("/company/update/{id}")
	public String updateCompany(@PathVariable("id") int id, Model model) {
		List<Company> companies=companyDAO.getAllCompanies();
		model.addAttribute("list",companies);
		Company company=companyDAO.getCompanyById(id);
		model.addAttribute("company",company);
		return "companies";
	}
	

}
