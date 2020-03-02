package com.cts.training.initialpublicofferingservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPOServiceImpl implements IPOService{
	
	@Autowired
	IPORepo IPORepo;

	@Override
	public IPO insert(IPO ipo) {
		return IPORepo.save(ipo);
	}

	@Override
	public void remove(int id) {
		IPORepo.deleteById(id);
	}

	@Override
	public IPO update(IPO ipo) {
		return IPORepo.save(ipo);
	}

	@Override
	public IPO getById(int id) {
		Optional<IPO> ipo=IPORepo.findById(id);
		return ipo.orElse(new IPO());
	}

	@Override
	public List<IPO> getAll() {
		return IPORepo.findAll();
	}
	
}
