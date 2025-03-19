package com.example.demo.vehicleService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.vehicleDao.BikeDao;


@Service
public class BikeService {
	
	
		@Autowired
		BikeDao bd;
		public List<Bike> getThis(List<Bike> c) {
			return bd.getThis(c);
		}
		public List<Bike> getAll() {
			return bd.getAll();
		}
		public List<Bike> getByColor(String c) {
			List<Bike>bikes=bd.getAllBike();
			return bikes.stream().filter(x->x.getColour().equals(c)).toList();
		}
		public List<Integer> getByPrice(int a) {
			return bd.getAllBike().stream().map(m->m.getPrice()).filter(f->f>a).collect(Collectors.toList());
		}
		public List<String> getDistinctDetails() {
			return bd.getAllBike().stream().map(Bike::getColour).distinct().toList();
		}
		public List<Bike> getSorting() {
			return bd.getAllBike().stream().sorted(Comparator.comparing(Bike::getColour)).collect(Collectors.toList());
		}
		public Integer getMaxPrice() {
			return bd.getAllBike().stream().map(m->m.getPrice()).max(Comparable::compareTo).get();
		}
		public Bike getMinObject() {
			return bd.getAllBike().stream().min(Comparator.comparing(Bike::getPrice)).get();
		}
		public Bike getsecMax() {
			
			return bd.getAllBike().stream().sorted(Comparator.comparing(Bike::getPrice).reversed()).skip(1).findFirst().get();
}
		public Map<String, Long> getGroup() {
			return bd.getAllBike().stream().collect(Collectors.groupingBy(x->x.getColour(),Collectors.counting()));
		}
}

		
		
		
		
		
		
		
		