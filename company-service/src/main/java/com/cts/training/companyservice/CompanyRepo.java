package com.cts.training.companyservice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company, Integer>{
	
	public List<Company> findAllByNameContaining(String pattern);
	
	public Optional<Company> findByName(String name);

}
