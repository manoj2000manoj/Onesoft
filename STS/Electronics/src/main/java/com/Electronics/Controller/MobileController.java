package com.Electronics.Controller;

import java.util.List;


import javax.management.AttributeNotFoundException;
import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Electronics.Exception.BrandNotFoundException;
import com.Electronics.Exception.ColourNotFoundException;
import com.Electronics.Exception.ModelNotFoundException;
import com.Electronics.Exception.PriceNotFoundException;
import com.Electronics.Exception.StorageNotFoundException;
import com.Electronics.Exception.YearNotFoundException;
import com.Electronics.Service.MobileService;
import com.Electronics.entity.Mobile;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/mobile")
public class MobileController {

	@Autowired
	MobileService ms;
	
	@PostMapping("/postAll")
	public String postMethodName(@RequestBody List<Mobile> m) {
		return ms.postmethodname(m);
	}
	
	@GetMapping("/getall")
	public List<Mobile> getMethodName() {
		return  ms.getall();
	}
	@GetMapping("/getColour/{a}")
	public List<Mobile>getDetailsByColour(@PathVariable String a) throws ColourNotFoundException {
		return ms.getColour(a);
	}
	@GetMapping("/getBrand/{s}")
	public List<Mobile>getDetailsByBrand(@PathVariable String s) throws BrandNotFoundException {
		return ms.getBrand(s);
	}
	@GetMapping("/getBrandStarts/{m}")
	public List<Mobile>getBrandStarts(@PathVariable String m) throws ModelNotFoundException {
		return ms.getBrandStarts(m);
	}
	@GetMapping("/getStorage/{o}/{p}")
	public List<Mobile>getStorage(@PathVariable int o,@PathVariable int p) throws StorageNotFoundException {
		return ms.getStorage(o,p);
	}
	@GetMapping("/getYear/{k}/{j}")
	public List<Mobile>getYear(@PathVariable int k,@PathVariable int j) throws YearNotFoundException {
		return ms.getYear(k,j);
	}
	@PostMapping("/getPrice")
	public Mobile getPrice(@RequestBody Mobile m) throws PriceNotFoundException
	{
		return ms.getPrice(m);
	}
	
	
}
