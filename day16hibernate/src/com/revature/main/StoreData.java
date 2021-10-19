package com.revature.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.revature.bean.Customer;

public class StoreData {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

//		Employee e1 = new Employee();
//		e1.setId(5);
//		e1.setName("xyz1");
//		e1.setEmail("xyz1@gmail.com");

//		Address address = new Address(100, "7/G", "our street", "our city", "our state", "abc123");
		Customer customer = new Customer(1000, "Our customer", "our@gmail.com");

		session.save(customer);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}
}