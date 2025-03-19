package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String postEmp( Employee e) {
		er.save(e);
	
		return "Saved Successfully";

}
	public List<Employee> getAll() {
		
		return er.findAll();
	}
	public Employee getEmp(int a) {
	
		return er.findById(a).get();
	}
	public String getLast(int m) {
		er.deleteById(m);
		return "deleted successfully";
	}
	public String updateThat(int p, Employee e) {
		Employee x=er.findById(p).get();
		x.setName(e.getName());
		
		er.save(x);
		return "Updated name Successfully";
	}
}
