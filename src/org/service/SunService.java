package org.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.model.Sun;
import org.springframework.stereotype.Service;
import org.util.HibernateUtil;

@Service
public class SunService implements ISun {
	
	@Override
	public void insertSun (Sun sun)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(sun);
		transaction.commit();
		session.clear();
		session.close();
	}
	
	@Override
	public List<Sun> showSun()
	{
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Sun.class);
		List<Sun> suns = criteria.list();
		
		transaction.commit();
		session.close();
		return suns;
	}
}
