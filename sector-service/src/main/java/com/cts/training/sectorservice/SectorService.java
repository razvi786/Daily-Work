package com.cts.training.sectorservice;

import java.util.List;

public interface SectorService {
	
	public Sector insert(Sector sector);
	
	public void remove(int id);
	
	public Sector update(Sector sector);
	
	public Sector getById(int id);
	
	public List<Sector> getAll();

}
