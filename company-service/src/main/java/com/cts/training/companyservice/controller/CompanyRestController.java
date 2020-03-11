package com.cts.training.companyservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.companyservice.entity.Company;
import com.cts.training.companyservice.service.CompanyService;

@CrossOrigin(origins = "*")
@RestController
public class CompanyRestController {
	
	@Autowired
	CompanyService companyService;
	
	@PostMapping("/company")
	public ResponseEntity<?> saveCompany(@RequestBody Company c) {
		Company company= companyService.insert(c);
		return new ResponseEntity<Company>(company,HttpStatus.OK);
	}
	
	@DeleteMapping("/company/{id}")
	public void deleteCompany(@PathVariable int id) {
		companyService.remove(id);
	}
	
	@PutMapping("/company")
	public ResponseEntity<?> updateCompany(@RequestBody Company c) {
		Company company= companyService.update(c);
		return new ResponseEntity<Company>(company,HttpStatus.OK);
	}
	
	@GetMapping("/company")
	public ResponseEntity<?> getAllCompanies(){
		List<Company> companies= companyService.getAll();
		if(companies.size()>0) {
			return new ResponseEntity<List<Company>>(companies,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No Companies Found",HttpStatus.OK);
		}
	}
	
	@GetMapping("/company/{id}")
	public Company getCompanyById(@PathVariable int id) {
		return companyService.getById(id);
	}
	
	@GetMapping(value = "/company/pattern/{pattern}")
	public List<Company> getCompaniesByPattern(@PathVariable String pattern) {
		return companyService.getCompaniesByPattern(pattern);
	}
	
	@GetMapping("/company/name/{name}")
	public Company getCompanyByName(@PathVariable String name){
		return companyService.getCompanyByName(name);
	}

}
