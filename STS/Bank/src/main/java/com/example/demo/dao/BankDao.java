package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Repository.BankRepository;
import com.example.demo.entity.Bank;

@Repository
public class BankDao {
	@Autowired
	BankRepository br;

	public String postAllDetails(List<Bank> b) {
		br.saveAll(b);
		return "saved sucessfully";
	}
	
	public String getDetailsByIfscCode(String s) {
		List<Bank> banks = br.findAll();
		String bb="";
		for(Bank bk : banks)
			if(bk.getIfscCode().equals(s)){
				bb = bk.getBranch();
			}
		return bb;
	}
}