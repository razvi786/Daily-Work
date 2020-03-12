package com.cts.training.sectorservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.sectorservice.entity.Sector;
import com.cts.training.sectorservice.repo.SectorRepo;

@Service
public class SectorServiceImpl implements SectorService{
	
	@Autowired
	SectorRepo sectorRepo;

	@Override
	public Sector insert(Sector sector) {
		return sectorRepo.save(sector);
	}

	@Override
	public void remove(int id) {
		sectorRepo.deleteById(id);
	}

	@Override
	public Sector update(Sector sector) {
		return sectorRepo.save(sector);
	}

	@Override
	public List<Sector> getAll() {
		return sectorRepo.findAll();
	}
	
	@Override
	public Sector getById(int id) {
		Optional<Sector> s=sectorRepo.findById(id);
		return s.orElse(null);
	}
	
}
