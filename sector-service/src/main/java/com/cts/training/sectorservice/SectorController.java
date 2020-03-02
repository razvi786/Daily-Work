package com.cts.training.sectorservice;

import java.util.List;

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

@CrossOrigin(origins = "*")
@RestController
public class SectorController {
	
	@Autowired
	SectorService sectorService;
	
	@GetMapping("/sector")
	public ResponseEntity<?> getAllCompanies(){
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

}
