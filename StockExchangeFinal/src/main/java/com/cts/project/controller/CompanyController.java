package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.Company;
import com.cts.project.repo.CompanyRepo;

@CrossOrigin(origins = "*")
@RestController
public class CompanyController {
	
	@Autowired
	CompanyRepo companyRepo;
	
	@GetMapping("/company")
	public List<Company> getAllCompanies(){
		return companyRepo.findAll();
	}
	
	@GetMapping("/company/{id}")
	public Company getCompanyById(@PathVariable int id) {
		Optional<Company> company=companyRepo.findById(id);
		Company c= company.get();
		return c;
	}
	
	@PostMapping("/company")
	public Company saveCompany(@RequestBody Company company) {
		Company c=companyRepo.save(company);
		return c;
	}
	
	@DeleteMapping("/company/{id}")
	public void deleteCompany(@PathVariable int id) {
		companyRepo.deleteById(id);
	}
	
	@PutMapping("/company")
	public Company updateCompany(@RequestBody Company company) {
		Company c=companyRepo.save(company);
		return c;
	}
	
	
	

}
