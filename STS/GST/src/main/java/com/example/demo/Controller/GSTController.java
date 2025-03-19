package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.GSTService;
import com.example.demo.entity.GST;

@RestController
@RequestMapping(value="/GST")
public class GSTController {
	@Autowired
	GSTService gs;
	
	@PostMapping("/PostAll")
	public String postAll(@RequestBody List<GST> a) {
		return gs.postAll(a);
	}
	@GetMapping("/getAll")
	public List<GST>getAll(){
		return gs.getAll();
	}
	@GetMapping("/getPercentage/{a}")
	public int getPercentage(@PathVariable int a) {
		return gs.getPercentage(a);
	}

}
