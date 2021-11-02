package com.revature.datajpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.datajpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByName(String name);
	
	public List<Employee> findByAddress(String address);

}
