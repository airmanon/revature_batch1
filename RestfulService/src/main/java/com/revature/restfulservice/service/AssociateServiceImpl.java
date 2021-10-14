package com.revature.restfulservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.restfulservice.model.Associate;
import com.revature.restfulservice.repository.AssociateRepository;

@Service
public class AssociateServiceImpl implements AssociateService {

	@Autowired
	AssociateRepository associateRepository;

	@Override
	public List<Associate> findAll() {
		// TODO Auto-generated method stub
		return associateRepository.findAll();
	}

	@Override
	public Associate findById(int id) {
		// TODO Auto-generated method stub
		return associateRepository.findById(id).get();
	}

	@Override
	public void save(Associate associate) {
		// TODO Auto-generated method stub
		associateRepository.save(associate);
	}

	@Override
	public void update(int id, Associate associate) {
		// TODO Auto-generated method stub
		associateRepository.save(associate);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		associateRepository.deleteById(id);
	}

}
