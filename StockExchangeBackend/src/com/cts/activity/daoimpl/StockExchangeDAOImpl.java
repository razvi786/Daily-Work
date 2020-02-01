package com.cts.activity.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.activity.bean.StockExchange;
import com.cts.activity.dao.StockExchangeDAO;
import com.cts.activity.hibernate.HibernateUtil;

public class StockExchangeDAOImpl implements StockExchangeDAO{

	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	
	@Override
	public boolean saveStockExchange(StockExchange stockExchange) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(stockExchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateStockExchange(StockExchange stockExchange) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.update(stockExchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean removeStockExchange(StockExchange stockExchange) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.delete(stockExchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public StockExchange getStockExchangeById(int id) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			StockExchange stockExchange=session.get(StockExchange.class, id);
			session.update(stockExchange);
			tx.commit();
			session.close();
			return stockExchange;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StockExchange> displayAllStockExchanges() {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			List<StockExchange> stockExchanges=session.createQuery("FROM StockExchange").list();
			tx.commit();
			session.close();
			return stockExchanges;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

}
