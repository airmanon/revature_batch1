package com.revature.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.datajpa.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
