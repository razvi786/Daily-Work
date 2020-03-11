package com.cts.training.initialpublicofferingservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.initialpublicofferingservice.entity.IPO;
import com.cts.training.initialpublicofferingservice.repo.IPORepo;

@Service
public class IPOServiceImpl implements IPOService{
	
	@Autowired
	IPORepo ipoRepo;

	@Override
	public IPO insert(IPO ipo) {
		return ipoRepo.save(ipo);
	}

	@Override
	public void remove(int id) {
		ipoRepo.deleteById(id);
	}

	@Override
	public IPO update(IPO ipo) {
		return ipoRepo.save(ipo);
	}
	
	@Override
	public List<IPO> getAll() {
		return ipoRepo.findAll();
	}

	@Override
	public IPO getById(int id) {
		Optional<IPO> ipo=ipoRepo.findById(id);
		return ipo.orElse(null);
	}
	
}
