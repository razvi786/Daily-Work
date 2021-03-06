package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

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

import com.cts.project.bean.Company;
import com.cts.project.dto.CompanyDTO;
import com.cts.project.repo.CompanyRepo;
import com.cts.project.service.CompanyService;

@CrossOrigin(origins = "*")
@RestController
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/company")
	public ResponseEntity<?> getAllCompanies(){
		List<CompanyDTO> companies= companyService.getAll();
		if(companies.size()>0) {
			return new ResponseEntity<List<CompanyDTO>>(companies,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No Users Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/company/{id}")
	public ResponseEntity<?> getCompanyById(@PathVariable int id) {
		CompanyDTO companyDTO=companyService.getById(id);
		if(companyDTO!=null) {
			return new ResponseEntity<CompanyDTO>(companyDTO,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Company Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/company")
	public ResponseEntity<?> saveCompany(@RequestBody CompanyDTO c) {
		CompanyDTO companyDTO= companyService.insert(c);
		return new ResponseEntity<CompanyDTO>(companyDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/company/{id}")
	public void deleteCompany(@PathVariable int id) {
		companyService.remove(id);
	}
	
	@PutMapping("/company")
	public ResponseEntity<?> updateCompany(@RequestBody CompanyDTO c) {
		CompanyDTO companyDTO= companyService.update(c);
		return new ResponseEntity<CompanyDTO>(companyDTO,HttpStatus.OK);
	}

}
