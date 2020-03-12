package com.cts.training.sectorservice.service;

import java.util.List;

import com.cts.training.sectorservice.entity.Sector;

public interface SectorService {
	
	public Sector insert(Sector sector);
	
	public void remove(int id);
	
	public Sector update(Sector sector);
	
	public List<Sector> getAll();
	
	public Sector getById(int id);

}
