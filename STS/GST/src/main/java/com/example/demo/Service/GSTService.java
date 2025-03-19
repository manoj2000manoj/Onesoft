package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.GSTDao;
import com.example.demo.entity.GST;
@Service
public class GSTService {
	@Autowired
	GSTDao gd;

	public String postAll(List<GST> a) {
		
		return gd.postAll(a);
	}

	public List<GST> getAll() {
		
		return gd.getAll();
	}

	public int getPercentage(int a) {
		
		return gd.getPercentage(a);
	}

}
