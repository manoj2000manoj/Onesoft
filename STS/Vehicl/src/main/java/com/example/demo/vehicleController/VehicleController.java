package com.example.demo.vehicleController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Car;
import com.example.demo.vehicleService.VehicleService;

@RestController
@RequestMapping("/car")
public class VehicleController {
	@Autowired
	VehicleService vs;
	@PostMapping(value="/getCar")
	public List<Car> getThis(@RequestBody List<Car> c) {
		return vs.getThis(c);
	}
	@PostMapping("/PostSingleCar")
	public String postCar(@RequestBody Car e) {
		return vs.postCar(e);
	}
	@PostMapping("/PostAllCar")
	public List<Car> postAllCar(@RequestBody List<Car> e) {
		return vs.postAllCar(e);
	}
	
	
	
	@GetMapping("/getAll")
	public List<Car> getMethodName() {
		return vs.getAll();
	}
	@PutMapping("/putAll/{a}")
	public String putMethodName(@PathVariable int a, @RequestBody Car c) {		
		return vs.putCar(a,c);
	}
	@PatchMapping("patchAll/{a}")
	public String patchName(@PathVariable int a,@RequestBody Car c) {
		return vs.patchName(a, c);
	}
	@GetMapping("getByColour/{c}")
	public List<Car> getByColour(@PathVariable String c) {
		return vs.getByColour(c);
	}
	@GetMapping("/getMax")
	public int getMax() {
		return vs.getMax();
	}
	@GetMapping("/getPrice/{a}/{b}")
	public int getPrice(@PathVariable int a,@PathVariable int b) {
		return vs.getPrice(a,b);
	}
	@GetMapping("/getSort")
	public List<Car> getSort() {
		return vs.getSort();
	}
}


