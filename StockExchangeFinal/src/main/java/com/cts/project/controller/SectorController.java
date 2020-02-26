package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.Sector;
import com.cts.project.repo.SectorRepo;

@CrossOrigin(origins = "*")
@RestController
public class SectorController {
	
	@Autowired
	SectorRepo sectorRepo;
	
	@GetMapping("/sector")
	public List<Sector> getAllSectors(){
		return sectorRepo.findAll();
	}
	
	@GetMapping("/sector/{id}")
	public Sector getSectorById(@PathVariable int id) {
		Optional<Sector> sector=sectorRepo.findById(id);
		Sector s=sector.get();
		return s;
	}
	
	@PostMapping("/sector")
	public Sector saveSector(@RequestBody Sector sector) {
		Sector s=sectorRepo.save(sector);
		return s;
	}
	
	@DeleteMapping("/sector/{id}")
	public void deleteSector(@PathVariable int id) {
		sectorRepo.deleteById(id);
	}
	
	@PutMapping("/sector")
	public Sector updateSector(@RequestBody Sector sector) {
		Sector s=sectorRepo.save(sector);
		return s;
	}

}
