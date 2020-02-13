package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.bean.Sector;
import com.cts.training.dao.SectorDAO;

@Transactional
@Repository(value="sectorDAO")
public class SectorDAOImpl implements SectorDAO{
	
	@Autowired
	SessionFactory sessionFactory;

//	@Override
//	public boolean saveSector(Sector sector) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.save(sector);
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
//	public boolean updateSector(Sector sector) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.update(sector);
//			tx.commit();
//			session.close();
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}

	@Override
	public boolean removeSector(Sector sector) {
		try {
			sessionFactory.getCurrentSession().delete(sector);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public Sector getSectorById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Sector.class, id);
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sector> displayAllSectors() {
		try {
			List<Sector> sectors=sessionFactory.getCurrentSession().createQuery("FROM Sector").list();
			return sectors;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@Override
	public boolean saveOrUpdateSector(Sector sector) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(sector);
			return true;
		}catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

}
