package com.revature.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.datajpa.model.Account;
import com.revature.datajpa.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account findById(int id) {
		return accountRepository.findById(id).get();
	}

	@Override
	public void save(Account account) {
		accountRepository.save(account);

	}

	@Override
	public void update(int id, Account account) {
		accountRepository.save(account);

	}

	@Override
	public void delete(int id) {
		accountRepository.deleteById(id);

	}

}
