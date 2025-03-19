package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Entity.Student;
import com.example.demo.Exception.AgeNotFoundException;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public String post(Student a) throws AgeNotFoundException {
		if (a.getAge() < 18) {
			throw new AgeNotFoundException("age under 18");
		} else {
			return sd.post(a);
		}

	}

	public List<Student> getDetails() {
		
		return sd.getDetails();
	}

	public String putDetails(int a, Student s) {
		
		return sd.putDetails(a,s);
	}

	public String deleteObject(int b) {
		
		return sd.deleteObject(b);
	}

	public String postAll(List<Student> s) {
		
		return sd.postAll(s);
	}

	public String deleteAll() {
		
		return sd.deleteAll();
	}
}
