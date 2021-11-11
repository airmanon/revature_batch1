package com.revature.datajpa.service;

import java.util.List;

import com.revature.datajpa.model.Account;

public interface AccountService {
	List<Account> findAll();

	Account findById(int id);

	void save(Account account);

	void update(int id, Account account);

	void delete(int id);

}
