package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.bean.StockExchange;
import com.cts.training.dao.StockExchangeDAO;

@Transactional
@Repository(value = "stockExchangeDAO")
public class StockExchangeDAOImpl implements StockExchangeDAO{

	@Autowired
	SessionFactory sessionFactory;
	
//	@Override
//	public boolean saveStockExchange(StockExchange stockExchange) {
//		try {
//			sessionFactory.getCurrentSession().save(stockExchange);
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}
//
//	@Override
//	public boolean updateStockExchange(StockExchange stockExchange) {
//		try {
//			sessionFactory.getCurrentSession().update(stockExchange);
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}

	@Override
	public boolean removeStockExchange(StockExchange stockExchange) {
		try {
			sessionFactory.getCurrentSession().delete(stockExchange);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public StockExchange getStockExchangeById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockExchange.class, id);
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StockExchange> displayAllStockExchanges() {
		try {
			List<StockExchange> stockExchanges=sessionFactory.getCurrentSession().createQuery("FROM StockExchange").list();
			return stockExchanges;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@Override
	public boolean saveOrUpdateStockExchange(StockExchange stockExchange) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(stockExchange);
			return true;
		}catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

}
