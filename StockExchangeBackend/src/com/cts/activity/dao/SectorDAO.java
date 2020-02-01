package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.Sector;

public interface SectorDAO {
	
	public boolean saveSector(Sector sector);
	
	public boolean updateSector(Sector sector);
	
	public boolean removeSector(Sector sector);
	
	public Sector getSectorById(int id);
	
	public List<Sector> displayAllSectors();

}
