package com.cts.training.sectorservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.sectorservice.entity.Sector;
import com.cts.training.sectorservice.service.SectorService;

@CrossOrigin(origins = "*")
@RestController
public class SectorRestController {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SectorService sectorService;	
	
	@PostMapping("/sector")
	public ResponseEntity<?> saveSector(@RequestBody Sector s) {
		Sector sector= sectorService.insert(s);
		return new ResponseEntity<Sector>(sector,HttpStatus.OK);
	}
	
	@DeleteMapping("/sector/{id}")
	public void deleteSector(@PathVariable int id) {
		sectorService.remove(id);
	}
	
	@PutMapping("/sector")
	public ResponseEntity<?> updateSector(@RequestBody Sector s) {
		Sector sector= sectorService.update(s);
		return new ResponseEntity<Sector>(sector,HttpStatus.OK);
	}
	
	@GetMapping("/sector")
	public ResponseEntity<?> getAllSectors(){
		List<Sector> sectors= sectorService.getAll();
		if(sectors.size()>0) {
			return new ResponseEntity<List<Sector>>(sectors,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No Sectors Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/sector/{id}")
	public ResponseEntity<?> getSectorById(@PathVariable int id) {
		Sector sector=sectorService.getById(id);
		if(sector!=null) {
			return new ResponseEntity<Sector>(sector,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Sector Not Found",HttpStatus.NOT_FOUND);
		}
	}

}
