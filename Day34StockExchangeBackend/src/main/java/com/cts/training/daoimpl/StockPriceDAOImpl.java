//package com.cts.training.daoimpl;
//
//import java.util.List;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import com.cts.activity.hibernate.HibernateUtil;
//import com.cts.training.bean.StockPrice;
//import com.cts.training.dao.StockPriceDAO;
//
//public class StockPriceDAOImpl implements StockPriceDAO {
//
//	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//	
//	@Override
//	public boolean saveStockPrice(StockPrice stockPrice) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.save(stockPrice);
//			tx.commit();
//			session.close();
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}
//
//	@Override
//	public boolean updateStockPrice(StockPrice stockPrice) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.update(stockPrice);
//			tx.commit();
//			session.close();
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}
//
//	@Override
//	public boolean deleteStockPrice(StockPrice stockPrice) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.delete(stockPrice);
//			tx.commit();
//			session.close();
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}
//
//	@Override
//	public StockPrice getStockPriceById(int id) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			StockPrice stockPrice=session.get(StockPrice.class, id);
//			tx.commit();
//			session.close();
//			return stockPrice;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return null;
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<StockPrice> displayAllStockPrices() {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			List<StockPrice> stockPrices=session.createQuery("FROM StockPrice").list();
//			tx.commit();
//			session.close();
//			return stockPrices;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return null;
//		}
//	}
//
//	@Override
//	public boolean importData(String path) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
