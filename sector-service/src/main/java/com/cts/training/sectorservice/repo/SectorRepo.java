package com.cts.training.sectorservice.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.training.sectorservice.entity.Sector;


public interface SectorRepo extends JpaRepository<Sector, Integer>{


}
