package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService ps;
	@PostMapping("/postValue")
	public String postValue(@RequestBody List<Product> a) {
		
		return ps.postValue(a);
	}
	@GetMapping("/getValue")
	public List<Product> getValue() {
		
		return ps.getValue();
	}
	@DeleteMapping("/deleteValue")
	public String deleteValue() {
		
		return ps.deleteValue();
	}

}
