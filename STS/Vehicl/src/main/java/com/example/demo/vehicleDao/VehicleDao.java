package com.example.demo.vehicleDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Car;
import com.example.demo.vehicleRepository.VehicleRepository;
@Repository
public class VehicleDao {
	@Autowired
	VehicleRepository vr;
	public List<Car> getThis(List<Car> c) {
		
		return vr.saveAll(c);
	}
	public String postCar(Car e) {
		vr.save(e);
		return "Saved Successfully";
	}
	
	public List<Car> getAll() {
		return vr.findAll();
	}
	public String putCar(int a, Car c) {
		Car byId = vr.findById(a).get();
		byId.setBrand(c.getBrand());
		byId.setPrice(c.getPrice());
		byId.setColour(c.getColour());
		byId.setModelYear(c.getModelYear());
		byId.setNoOfSeats(c.getNoOfSeats());
		 vr.save(byId);
		 return "Successfully Updated";
	}
	public String patchName(int a, Car c) {
		Car car = vr.findById(a).get();
		car.setNoOfSeats(c.getNoOfSeats());
		vr.save(car);
		return "Patched SuccessFully";
	}
	public List<Car> getByColour(String c) {
		
		return vr.getByColour(c);
	}
	public int getMax() {
		
		return vr.getMaxCar();
	}
	public List<Car> postAllCar(List<Car> e) {
		return vr.saveAll(e);
	}
	public int getPrice(int a, int b) {
		
		return vr.getPrice(a,b);
	}
	public List<Car> getSort() {
		
		return vr.sortByPrice();
	}

}



