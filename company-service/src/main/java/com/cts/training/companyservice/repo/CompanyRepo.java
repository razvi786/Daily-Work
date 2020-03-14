package com.cts.training.companyservice.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.companyservice.entity.Company;
import com.cts.training.companyservice.entity.ListedIn;

public interface CompanyRepo extends JpaRepository<Company, Integer>{
	
	public List<Company> findAllByNameContaining(String pattern);
	
	public Optional<Company> findByName(String name);
	
	public List<ListedIn> findListedInByName(String companyName);

}
