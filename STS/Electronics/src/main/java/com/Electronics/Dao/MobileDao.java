package com.Electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Electronics.Repository.MobileRepository;
import com.Electronics.entity.Mobile;

@Repository
public class MobileDao {

	@Autowired
	MobileRepository mr;

	public String postmethodname(List<Mobile> m) {
		mr.saveAll(m);
		return "posted successfully";
	}

	public List<Mobile> getall() {
		return mr.findAll();
	}

	public List<Mobile> getColour(String a) {

		return mr.getColour(a);
	}

	public List<Mobile> getBrand(String s) {

		return mr.getBrand(s);
	}

	public List<Mobile> getBrandStarts(String m) {
		return mr.getBrandStarts(m);
	}

	public List<Mobile> getStorage(int o, int p) {

		return mr.getStorage(o, p);
	}

	public List<Mobile> getYear(int k, int j) {

		return mr.getYear(k, j);
	}

	public Mobile getPrice(int g,int h) {
		
		return mr.getPrice(g,h);
	}

	public Mobile getPrice(Mobile m) {
		
		return mr.save(m);
	}

}
