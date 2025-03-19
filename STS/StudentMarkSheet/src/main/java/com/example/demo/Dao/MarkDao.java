package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Repository.MarkRepository;
import com.example.demo.entity.MarkSheet;
@Repository
public class MarkDao {
	@Autowired
	MarkRepository mr;

	public String postAllDetails(List<MarkSheet> m) {
		mr.saveAll(m);
		return "posted successfully";
	}

	public List<MarkSheet> getAll() {
		
		return mr.findAll();
	}


	public String deleteAll() {
		mr.deleteAll();
		return "deleted successfully";
	}

}
