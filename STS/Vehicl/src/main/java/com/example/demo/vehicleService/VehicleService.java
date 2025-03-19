package com.example.demo.vehicleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.vehicleDao.VehicleDao;

@Service
public class VehicleService {
	@Autowired
	VehicleDao vd;
	public List<Car> getThis(List<Car> c) {
		return vd.getThis(c);
	}
	public String postCar(Car e) {
		
		return vd.postCar(e);
	}
	public List<Car> getAll() {
		
		return vd.getAll();
	}
	public String putCar(int a, Car c) {
		
		return vd.putCar(a,c);
	}
	public String patchName(int a, Car c) {
		
		return vd.patchName(a,c);
	}
	public List<Car> getByColour(String c) {
		
		return vd.getByColour(c);
	}
	public int getMax() {
		
		return vd.getMax();
	}
	public List<Car> postAllCar(List<Car> e) {
		
		return vd.postAllCar(e);
	}
	public int getPrice(int a,int b) {
		
		return vd.getPrice(a,b);
	}
	public List<Car> getSort() {
		
		return vd.getSort();
	}
	

}
