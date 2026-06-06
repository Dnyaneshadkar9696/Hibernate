package hq.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import hq.entity.HibernateEntity;

public class HibernateRepo {
	
	public void insertData(HibernateEntity ei) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(HibernateEntity.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tt = s.beginTransaction();
		
		// in hibernate we set the values from here the @value annotation is available in the spring
	
		// set the values from here
		
		s.persist(ei);
		
		tt.commit();
		s.clear();
		System.out.println("Data inserted...");
		
	}
	
	public void deletData(HibernateEntity he) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(HibernateEntity.class);
		
		SessionFactory fac = con.buildSessionFactory();
		Session sr = fac.openSession();
		Transaction t = sr.beginTransaction();
		
		sr.remove(he);
		
		t.commit();
		sr.close();
		System.out.println("Data deleted...");
	}
	
	public void updateData(HibernateEntity up) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(HibernateEntity.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session srr = fact.openSession();
		Transaction ti = srr.beginTransaction();
		
		up.setLibName("Gadruda");
		up.setLibCity("Nashik");
		up.setLibMob(7827383992l);
		
		srr.merge(up);
		
		ti.commit();
		srr.close();
		System.out.println("Data updated...");
		
	}
	
	public HibernateEntity getsingleData(HibernateEntity get) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(HibernateEntity.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session srr = fact.openSession();
		Transaction ti = srr.beginTransaction();
		
		
		HibernateEntity hib = srr.get(HibernateEntity.class, 2);
		
		
		ti.commit();
		srr.close();
		
		return hib;
		
	}
	
	public List<HibernateEntity> getallData() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(HibernateEntity.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session srr = fact.openSession();
		Transaction ti = srr.beginTransaction();
		
		Query<HibernateEntity> q = srr.createQuery("From HibernateEntity", HibernateEntity.class);
		
		List<HibernateEntity> list = q.list();
		
		ti.commit();
		srr.close();
		
		return list;
		
	}

}
