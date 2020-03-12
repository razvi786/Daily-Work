package com.cts.training.sectorservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.sectorservice.entity.Sector;


public interface SectorRepo extends JpaRepository<Sector, Integer>{

}
