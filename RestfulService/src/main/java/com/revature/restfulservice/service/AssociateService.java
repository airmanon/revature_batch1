package com.revature.restfulservice.service;

import java.util.List;

import com.revature.restfulservice.model.Associate;

public interface AssociateService {
	public List<Associate> findAll();

	public Associate findById(int id);

	public void save(Associate associate);

	public void update(int id, Associate associate);

	public void delete(int id);
}
