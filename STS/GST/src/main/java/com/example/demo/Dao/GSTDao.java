package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Repository.GSTRepository;
import com.example.demo.entity.GST;
@Repository
public class GSTDao {
	@Autowired
	GSTRepository gr;

	public String postAll(List<GST> a) {
		gr.saveAll(a);
		return "Posted Successfully";
	}

	public List<GST> getAll() {
		
		return gr.findAll();
	}

	public int getPercentage(int a) {
		List<GST> g=gr.findAll();
		for(GST h:g) {
			if(h.getHsncode()==a) {
				return h.getPercentage();
			}
		}
		
		return 0;
	}

}
