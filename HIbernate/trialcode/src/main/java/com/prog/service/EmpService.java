package com.prog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.pojo.Bank;
import com.prog.repo.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo repo;
	
	public void addbank(Bank b) {
		repo.save(b);
	}
}
