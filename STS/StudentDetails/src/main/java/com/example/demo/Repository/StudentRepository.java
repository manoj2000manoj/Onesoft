package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	@Query(value = "select * from student where age =?", nativeQuery =true)
	public String post(Student a);
	

	
}
