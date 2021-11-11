package com.revature.datajpa.controller;

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

import com.revature.datajpa.model.Account;
import com.revature.datajpa.service.AccountService;

@RestController
//@RequestMapping("/api/v1")
public class AccountController {

	@Autowired
	AccountService accountService;

	@GetMapping("/accounts")
	public List<Account> getAccounts() {
		return accountService.findAll();
	}

	@GetMapping("/accounts/{id}")
	public Account getAccount(@PathVariable int id) {
		return accountService.findById(id);
	}

	@PostMapping("/accounts")
	public void save(@RequestBody Account account) {
		accountService.save(account);
	}

	@PutMapping("/accounts/{id}")
	public void update(@PathVariable int id, @RequestBody Account account) {
		accountService.save(account);
	}

	@DeleteMapping("/accounts/{id}")
	public void delete(@PathVariable int id) {
		accountService.delete(id);
	}
}
