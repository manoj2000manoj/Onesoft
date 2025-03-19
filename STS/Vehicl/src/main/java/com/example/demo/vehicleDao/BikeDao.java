package com.example.demo.vehicleDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bike;
import com.example.demo.vehicleRepository.BikeRepository;


@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
	public List<Bike> getThis(List<Bike> c) {
		
		return br.saveAll(c);
	}
	public List<Bike> getAll() {
		
		return br.findAll();
	}
	public List<Bike> getAllBike() {
		
		return br.findAll();
	}



}
