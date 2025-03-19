package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public String postEmp( Employee e) {
		return ed.postEmp(e);

}
	public List<Employee> getAll() {
		
		return ed.getAll();
	}
	public Employee getEmp(int a) {
		
		return ed.getEmp(a);
	}
	public String getLast(int m) {
		
		return ed.getLast(m);
	}
//	public String updateThis(int o, Employee e) {
//		
//		return ed.updateThis(o,e);
//	}
public String updateThat(int p, Employee e) {
		
		return ed.updateThat(p,e);
}
	
}
