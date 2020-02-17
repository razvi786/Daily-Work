package com.cts.training.dao;

import java.util.List;


import com.cts.training.bean.Supplier;

public interface SupplierDAO {
	
	
	public boolean saveOrUpdateSupplier(Supplier supplier);

	public boolean deleteSupplier(Supplier supplier);

	public Supplier getSupplierById(int id);

	public List<Supplier> getAllSuppliers();
	

}
