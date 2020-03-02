package com.cts.training.initialpublicofferingservice;

import java.util.List;

public interface IPOService {
	
	public IPO insert(IPO IPO);
	
	public void remove(int id);
	
	public IPO update(IPO IPO);
	
	public IPO getById(int id);
	
	public List<IPO> getAll();

}
