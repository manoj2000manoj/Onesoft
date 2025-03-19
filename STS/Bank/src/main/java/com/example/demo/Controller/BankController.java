package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BankService;
import com.example.demo.entity.Bank;

@RequestMapping("/bank")
@RestController
public class BankController {
	@Autowired
	BankService bs;

	@PostMapping("/postAllDetails")
	public String postAllDetails(@RequestBody List<Bank> b) {

		return bs.postAllDetails(b);
	}

	@GetMapping("/getDetailsByIfscCode/{s}")
	public String getDetailsByIfscCode(@PathVariable String s) {
		return bs.getDetailsByIfscCode(s);
	}

}