package com.revature.p2backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p2backend.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public List<Customer> findByEmail(String email);
	
	public List<Customer> findByMobile(long mobile);
}
