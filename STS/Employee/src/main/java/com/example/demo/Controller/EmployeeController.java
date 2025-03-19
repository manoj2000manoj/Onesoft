package com.example.demo.Controller;

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

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping(value="/emp")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/postSingleEmp")
	public String postEmp(@RequestBody Employee e) {
		return es.postEmp(e);
	}
    @GetMapping(value="/ListEmp")
    public List<Employee> getAll(){
    	return es.getAll();
    }
    @GetMapping(value="/singleEmp/{a}")
    public Employee getEmp(@PathVariable int a) {
    	return es.getEmp(a);
    }
    @GetMapping(value="/deleteEmp/{m}")
    public String getLast(@PathVariable int m) {
    	return es.getLast(m);
    }
    @PutMapping(value="/updateEmp/{o}")
    public String updateThis(@PathVariable int o,@RequestBody Employee e) {
    	return es.updateThat(o,e);
    }
    @PatchMapping(value="/updateEmp1/{p}")
    public String updateThat(@PathVariable int p,@RequestBody Employee e) {
    	return es.updateThat(p,e);
    }

}
