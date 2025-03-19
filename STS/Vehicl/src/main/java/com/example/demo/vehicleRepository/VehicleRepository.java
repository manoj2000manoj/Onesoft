package com.example.demo.vehicleRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Car;

public interface VehicleRepository extends JpaRepository<Car,Integer> {
	@Query(value="select * from vehicledetails where colour = ?",nativeQuery=true)
	public List<Car>getByColour(String c);
	@Query(value="select max(price)from vehicledetails",nativeQuery=true)
	public int getMaxCar();
	@Query(value="select count(price) from vehicledetails where price>? and price<?;",nativeQuery=true)
	public int getPrice(int a,int b);
	@Query(value="select * from vehicledetails order by price;",nativeQuery=true)
	public List<Car>sortByPrice();
}
