package com.revature.restfulservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.restfulservice.model.Associate;
import com.revature.restfulservice.service.AssociateService;

@RestController
@RequestMapping("/api/v1")
public class AssociateController {

	@Autowired
	AssociateService associateService;

	@GetMapping("/associate")
	public List<Associate> findAll() {
		return associateService.findAll();
	}

	@GetMapping("/associate/{id}")
	public Associate findById(@PathVariable int id) {
		return associateService.findById(id);
	}

	@PostMapping("/associate")
	public void save(@RequestBody Associate associate) {
		associateService.save(associate);
	}

	@PutMapping("/associate/{id}")
	public void update(@PathVariable int id, @RequestBody Associate associate) {
		associateService.save(associate);
	}

	@DeleteMapping("/associate/{id}")
	public void delete(@PathVariable int id) {
		associateService.delete(id);
	}
}
