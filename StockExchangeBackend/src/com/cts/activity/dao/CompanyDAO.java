package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.Company;

public interface CompanyDAO {
	
	public boolean saveCompany(Company company);
	
	public boolean updateCompany(Company company);
	
	public boolean removeCompany(Company company);
	
	public Company getCompanyById(int id);
	
	public List<Company> getAllCompanies();

}
