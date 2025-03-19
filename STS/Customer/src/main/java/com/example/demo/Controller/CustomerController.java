package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Service.CustomerService;
import com.example.demo.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService cs;
	RestTemplate rt;
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<Customer> a) {
		return cs.postAll(a);
	}
	@PostMapping("/postbranch")
	public String postBranch(@RequestBody List<Customer> a) {
		return cs.PostBranch(a);
	}

}
