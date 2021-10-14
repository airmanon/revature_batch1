package com.revature.restfulservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.restfulservice.model.Associate;

@Repository
public interface AssociateRepository extends JpaRepository<Associate, Integer> {

}
