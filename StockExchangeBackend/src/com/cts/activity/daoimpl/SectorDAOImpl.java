package com.cts.activity.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.activity.bean.Sector;
import com.cts.activity.dao.SectorDAO;
import com.cts.activity.hibernate.HibernateUtil;

public class SectorDAOImpl implements SectorDAO{
	
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();

	@Override
	public boolean saveSector(Sector sector) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(sector);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateSector(Sector sector) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.update(sector);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean removeSector(Sector sector) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.delete(sector);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public Sector getSectorById(int id) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			Sector sector=session.get(Sector.class, id);
			tx.commit();
			session.close();
			return sector;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sector> displayAllSectors() {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			List<Sector> sectors=session.createQuery("FROM Sector").list();
			tx.commit();
			session.close();
			return sectors;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

}
