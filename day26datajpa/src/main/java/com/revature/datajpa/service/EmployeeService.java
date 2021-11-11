package com.revature.datajpa.service;

import java.util.List;

import com.revature.datajpa.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int id);

	void save(Employee employee);

	void update(int id, Employee employee);

	void delete(int id);

	public List<Employee> findByName(String name);

	public List<Employee> findByAddress(String address);

}
