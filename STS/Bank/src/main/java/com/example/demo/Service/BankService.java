package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BankDao;
import com.example.demo.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bd;

	public String postAllDetails(List<Bank> b) {

		return bd.postAllDetails(b);
	}
	
	public String getDetailsByIfscCode(String s) {
		
		return bd.getDetailsByIfscCode(s);
	}

}
