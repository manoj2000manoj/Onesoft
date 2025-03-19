package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.entity.Product;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String postValue(List<Product> a) {
		pr.saveAll(a);
		return "posted successfully"  ;
	}

	public List<Product> getValue() {
		
		return pr.findAll();
	}

	public String deleteValue() {
		pr.deleteAll();
		return "delete successfully";
	}

}
