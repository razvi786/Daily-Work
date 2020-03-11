package com.cts.training.companyservice;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
	
	public Company insert(Company company);
	
	public void remove(int id);
	
	public Company update(Company company);
	
	public Company getById(int id);
	
	public List<Company> getAll();

	List<Company> getCompaniesByPattern(String pattern);

	Optional<Company> getCompanyByName(String name);

}
