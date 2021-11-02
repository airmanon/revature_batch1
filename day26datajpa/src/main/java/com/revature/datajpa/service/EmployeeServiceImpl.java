package com.revature.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.datajpa.model.Employee;
import com.revature.datajpa.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void update(int id, Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}

	public List<Employee> findByName(String name) {
		return employeeRepository.findByName(name);
	}

	public List<Employee> findByAddress(String address) {
		return employeeRepository.findByAddress(address);
	}
}
