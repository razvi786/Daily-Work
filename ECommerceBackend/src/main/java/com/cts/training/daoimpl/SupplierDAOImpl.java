package com.cts.training.daoimpl;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.bean.Supplier;
import com.cts.training.dao.SupplierDAO;



@Transactional
@Repository(value="supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean deleteSupplier(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Supplier getSupplierById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Supplier.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Supplier> getAllSuppliers() {
		try {
			List<Supplier> suppliers = sessionFactory.getCurrentSession().createQuery("from Supplier").list();
			return suppliers;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean saveOrUpdateSupplier(Supplier supplier) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
}