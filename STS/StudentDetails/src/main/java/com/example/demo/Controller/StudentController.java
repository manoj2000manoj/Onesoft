package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Exception.AgeNotFoundException;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentService ss;
 
	@PostMapping(value = "/post")
	public String post(@RequestBody Student a) throws AgeNotFoundException {
		return ss.post(a);
	}
	@PostMapping(value ="/postAll")
	public String postAll(@RequestBody List<Student>s) {
		return ss.postAll(s);
	}
	@GetMapping(value ="/getDetails")
	public List<Student>getDetails(){
		return ss.getDetails();
	}
	@PutMapping(value="/changeDetails/{a}")
	public String putDetails(@PathVariable int a,@RequestBody Student s) {
		return ss.putDetails(a,s);
	}
	@GetMapping(value="/deleteDetails/{b}")
	public String deleteObject(@PathVariable int b) {
		return ss.deleteObject(b);
	}
	@DeleteMapping(value="/delete")
	public String deleteAll() {
		return ss.deleteAll();
	}

}
