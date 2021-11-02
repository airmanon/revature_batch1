package com.revature.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.datajpa.model.Employee;
import com.revature.datajpa.service.EmployeeService;

@RestController
//@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/index")
	public String welcome(Model model) {
		model.addAttribute(employeeService.findAll());
		return "index";
	}

	@GetMapping("/signup")
	public String showSignUpForm(Employee employee) {
		return "addEmployee.html";
	}

	@PostMapping("/addEmployee")
	public String addUser(@Validated Employee employee, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "addEmployee.html";
		}

		employeeService.save(employee);
		return "redirect:/index";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
		Employee employee = employeeService.findById(id);
//	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

		model.addAttribute("employee", employee);
		return "editEmployee";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.findById(id);
	}

	@PostMapping("/employees")
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
	}

	@PutMapping("/employees/{id}")
	public void editEmployee(@PathVariable int id, @RequestBody Employee employee) {
		employeeService.save(employee);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeById(@PathVariable int id) {
		employeeService.delete(id);
	}

	@GetMapping("/employees/namesearch/{name}")
	public List<Employee> searchByName(@PathVariable String name) {
		return employeeService.findByName(name);
	}

	@GetMapping("/employees/addresssearch/{address}")
	public List<Employee> searchByAddress(@PathVariable String address) {
		return employeeService.findByAddress(address);
	}
}
