package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ResultDao;
import com.example.demo.entity.Results;

@Service
public class ResultService {
	@Autowired
	ResultDao rd;

	// Using @PostMapping to get the totalMarks and Percentage for all objects:

		public String fullDetails() {
			return rd.fullDetails();
		}

		// using @GetMapping to get the Toper from the table details:

		public Results getTopperByMark() {
			return rd.getTopperByMark();
		}

		// Using @GetMapping and stream() to get the Top 3 object:

		public List<Results> getTop3Details() {
			return rd.getTop3Details();
		}

		// Using @getMapping and query to find the object between the totalMarks 70-90:

		public List<Results> getByMarks() {
			return rd.getByMarks();
		}

	}