package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;

	public String post(Student a) {
		sr.save(a);
		return "Posted Successfully";
	}
	public List<Student> getDetails(){
		return sr.findAll();
	}
	public String putDetails(int a,Student s) {
		Student st=sr.findById(a).get();
		st.setName(s.getName());
		st.setRollNumber(s.getRollNumber());
		st.setGender(s.getGender());
		st.setAge(s.getAge());
		st.setCourse(s.getCourse());
		st.setAttendance(s.getAttendance());
		sr.save(st);
		return "changed successfully";
	}
	public String deleteObject(int b) {
		sr.deleteById(b);
		return "deleted successfully"; 
	}
	public String postAll(List<Student> s) {
		sr.saveAll(s);
		return "posted successFully";
	}
	public String deleteAll() {
		sr.deleteAll();
		return "deleted Successfully";
	}
	
}

	