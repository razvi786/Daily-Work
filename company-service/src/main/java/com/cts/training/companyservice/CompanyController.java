package com.cts.training.companyservice;

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

@CrossOrigin(origins = "*")
@RestController
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/company")
	public ResponseEntity<?> getAllCompanies(){
		List<Company> companies= companyService.getAll();
		if(companies.size()>0) {
			return new ResponseEntity<List<Company>>(companies,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No Companies Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/company/{id}")
	public ResponseEntity<?> getCompanyById(@PathVariable int id) {
		Company company=companyService.getById(id);
		if(company!=null) {
			return new ResponseEntity<Company>(company,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Company Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	
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

}
