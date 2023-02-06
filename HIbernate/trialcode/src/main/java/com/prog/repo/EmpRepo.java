package com.prog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prog.pojo.Bank;

@Repository
public interface EmpRepo extends JpaRepository<Bank, Integer>{

}
