package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Results;

public interface ResultRepository extends JpaRepository<Results, Integer> {
	
	@Query(value ="select * from results where total_marks=(select max(total_marks) from results)",nativeQuery =true)
	public Results getTopperByMark();
	@Query(value ="select * from results where total_marks between 70 and 90",nativeQuery =true)
	public List<Results> getByMarks();
	

}
     