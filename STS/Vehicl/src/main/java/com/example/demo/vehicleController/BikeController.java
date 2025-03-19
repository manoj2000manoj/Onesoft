package com.example.demo.vehicleController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;

import com.example.demo.vehicleService.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {
	@Autowired
	BikeService bs;
	@PostMapping(value="/getBike")
	public List<Bike> getThis(@RequestBody List<Bike> b) {
		return bs.getThis(b);
		
	}
	@GetMapping("/getAll")
	public List<Bike> getMethodName() {
		return bs.getAll();
	}
	@GetMapping(value="/getByColor/{c}")
	public List<Bike>getByColor(@PathVariable String c) {
		return bs.getByColor(c);
	}
	@GetMapping("/getByPrice/{a}")
	public List<Integer> getByPrice(@PathVariable int a) {
		return bs.getByPrice(a);
	}
	@GetMapping("/getDistinctDetails")
	public List<String> getDistinctDetails() {
		return bs.getDistinctDetails();
	}
	@GetMapping("/sorted")
	public List<Bike> getSorting() {
		return bs.getSorting();
	}
	@GetMapping("/getMaxPrice")
	public Integer getMaxPrice() {
		return bs.getMaxPrice();
	}
	@GetMapping("/getMinObject")
	public Bike getMinObject() {
		return bs.getMinObject();
	}
	@GetMapping("/getSecMax")
	public Bike getSecMax() {
		return bs.getsecMax();
	}
	@GetMapping("/getGroupingBy")
	public Map<String,Long>getGroupingBy() {
		return bs.getGroup();
		
	}

}
