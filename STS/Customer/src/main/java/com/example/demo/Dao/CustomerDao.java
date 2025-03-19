package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.entity.Customer;
@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cr;

	public String postAll(List<Customer> a) {
		cr.saveAll(a);
		return "posted successfully" ;
	}

	public String PostBranch(List<Customer> a) {
		cr.saveAll(a);
		return "posted successfully";
	}

}
