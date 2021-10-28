package com.revature.coursemgmt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.revature.coursemgmt.model.Course;

public class CourseDAO {

	private static SessionFactory sessionFactory = null;
	private static Session session = null;

	public static List<Course> findAll() {
		session = connect();
		session.beginTransaction();
		List<Course> courses = session.createQuery("FROM Course").list();
		session.getTransaction().commit();
		session.close();
		close();
		return courses;
	}

	public static Course findById(int id) {
		session = connect();
		session.beginTransaction();
		Course course = session.find(Course.class, id);
		session.getTransaction().commit();
		session.close();
		close();
		return course;
	}

	public static void save(Course course) {
		session = connect();
		session.beginTransaction();
		session.save(course);
		session.getTransaction().commit();
		session.close();
		close();
	}

	public static void update(int id, Course course) {
		session = connect();
		session.beginTransaction();
		session.save(course);
		session.getTransaction().commit();
		session.close();
		close();
	}

	public static void delete(int id) {
		session = connect();
		session.beginTransaction();
		Course course = session.find(Course.class, id);
		session.remove(session);
		session.getTransaction().commit();
		session.close();
		close();
	}

	public static Session connect() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		// configures settings from hibernate.cfg.xml
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble
			// building the SessionFactory so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}

		return sessionFactory.openSession();
	}

	public static void close() {
		try {
			if (session != null)
				session.close();
			if (sessionFactory != null)
				sessionFactory.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}