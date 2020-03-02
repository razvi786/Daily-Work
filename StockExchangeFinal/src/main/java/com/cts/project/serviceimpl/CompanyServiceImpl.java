package com.cts.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cts.project.bean.Company;
import com.cts.project.bean.User;
import com.cts.project.dto.CompanyDTO;
import com.cts.project.repo.CompanyRepo;
import com.cts.project.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyRepo companyRepo;

	@Override
	public CompanyDTO insert(CompanyDTO companyDTO) {
		Company companyEntity=new Company();
		BeanUtils.copyProperties(companyDTO, companyEntity);
		companyRepo.save(companyEntity);
		return companyDTO;
	}

	@Override
	public void remove(int id) {
		companyRepo.deleteById(id);
	}

	@Override
	public CompanyDTO update(CompanyDTO companyDTO) {
		Company companyEntity=new Company();
		BeanUtils.copyProperties(companyDTO, companyEntity);
		companyRepo.save(companyEntity);
		return companyDTO;
	}

	@Override
	public CompanyDTO getById(int id) {
		Optional<Company> c=companyRepo.findById(id);
		Company companyEntity=c.orElse(new Company());
		CompanyDTO companyDTO=new CompanyDTO();
		BeanUtils.copyProperties(companyEntity, companyDTO);
		return companyDTO;
	}

	@Override
	public List<CompanyDTO> getAll() {
		List<Company> companyEntities=new ArrayList<Company>();
		companyEntities=companyRepo.findAll();
		List<CompanyDTO> companyDTOs=new ArrayList<CompanyDTO>();
		for(Company compantEntity: companyEntities) {
			CompanyDTO companyDTO=new CompanyDTO();
			BeanUtils.copyProperties(compantEntity, companyDTO);
			companyDTOs.add(companyDTO);
		}
		return companyDTOs;
	}
	
	

}
