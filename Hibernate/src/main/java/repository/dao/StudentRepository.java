package repository.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import hibernate.entity.StudentEntity;

public class StudentRepository {

	public String insertStudent(StudentEntity se) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(StudentEntity.class);
		SessionFactory ss = con.buildSessionFactory();
		Session sei = ss.openSession();
		Transaction t = sei.beginTransaction();

		sei.persist(se);

		t.commit();
		sei.close();
		return "Data inserted successfully";
	}

	public String deleteStudent(StudentEntity e) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(StudentEntity.class);
		SessionFactory ss = con.buildSessionFactory();
		Session sei = ss.openSession();

		Transaction t = sei.beginTransaction();

		// get that id not the entity from the database

		StudentEntity student = sei.get(StudentEntity.class, e.getStudentId());

		sei.remove(student);

		t.commit();
		sei.close();
		return "Data deleted successfully";
	}

	public String updateStudent(StudentEntity sy) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(StudentEntity.class);
		SessionFactory ss = con.buildSessionFactory();
		Session sei = ss.openSession();

		Transaction t = sei.beginTransaction();

		// get that id not the entity from the database

		StudentEntity s = sei.get(StudentEntity.class, sy.getStudentId());

		// we will get that entity , object

		s.setStudentName(sy.getStudentName());
		s.setGender(sy.getGender());

		sei.persist(s);

		t.commit();
		sei.close();
		return "Data updated successfully";
	}

	public StudentEntity getSingleStudent(StudentEntity did) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(StudentEntity.class);
		SessionFactory ss = con.buildSessionFactory();
		Session seu = ss.openSession();
// get that id not the entity from the database

		StudentEntity sm = seu.get(StudentEntity.class, did.getStudentId());
		seu.close();
		return sm;

	}

	public List<StudentEntity> getAllStudent() {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(StudentEntity.class);
		SessionFactory ss = con.buildSessionFactory();
		Session seu = ss.openSession();
// get that id not the entity from the database

		Transaction ti = seu.beginTransaction();
		
		Query q = seu.createQuery("from StudentEntity", StudentEntity.class);

		List<StudentEntity> std = q.list();
		
		return std;
	}
}
