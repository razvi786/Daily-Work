package com.cts.training.initialpublicofferingservice.service;

import java.util.List;

import com.cts.training.initialpublicofferingservice.entity.IPO;

public interface IPOService {
	
	public IPO insert(IPO IPO);
	
	public void remove(int id);
	
	public IPO update(IPO IPO);
	
	public List<IPO> getAll();
	
	public IPO getById(int id);

}
