package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.MarkService;
import com.example.demo.entity.MarkSheet;



@RestController
@RequestMapping(value="/marksheet")
public class MarkController {
	@Autowired
	MarkService ms;
	
	@PostMapping("/postAllMarkSheet")
	public String postAllDetails(@RequestBody List<MarkSheet>m) {
		return ms.postAllDetails(m);
	}
	@GetMapping("/getAllMarkSheet")
	public List<MarkSheet>getAll(){
		return ms.getAll();
	}
	@DeleteMapping("/deleteAll")
	public String deleteAll(){
		return ms.deleteAll();
	}

}
