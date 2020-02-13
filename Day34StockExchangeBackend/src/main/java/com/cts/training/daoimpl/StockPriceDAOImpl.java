package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.bean.StockPrice;
import com.cts.training.dao.StockPriceDAO;

@Transactional
@Repository(value = "stockPriceDAO")
public class StockPriceDAOImpl implements StockPriceDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean deleteStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().delete(stockPrice);
			return true;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
	}

	@Override
	public StockPrice getStockPriceById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockPrice.class, id);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StockPrice> displayAllStockPrices() {
		try {
			List<StockPrice> stockPrices = sessionFactory.getCurrentSession().createQuery("FROM StockPrice").list();
			return stockPrices;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return null;
		}
	}

	@Override
	public boolean saveOrUpdateStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(stockPrice);
			return true;
		}catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

}
