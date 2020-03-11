package com.cts.training.companyservice.service;

import java.util.List;

import com.cts.training.companyservice.entity.Company;

public interface CompanyService {
	
	public Company insert(Company company);
	
	public void remove(int id);
	
	public Company update(Company company);
	
	public List<Company> getAll();
	
	public Company getById(int id);

	List<Company> getCompaniesByPattern(String pattern);

	public Company getCompanyByName(String name);

}
