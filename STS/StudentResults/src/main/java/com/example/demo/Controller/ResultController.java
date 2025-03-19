package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ResultService;
import com.example.demo.entity.Results;

@RestController
@RequestMapping(value="/result")
public class ResultController {
	@Autowired
	ResultService rs;
	
	// Using @PostMapping to get the totalMarks and Percentage for all objects:

		@PostMapping("/getFullDetails")
		public String fullDetails() {
			return rs.fullDetails();
		}

		// using @GetMapping to get the Toper from the table details:

		@GetMapping("/getToperDetails")
		public Results getTopperByMark() {
			return rs.getTopperByMark();
		}

		// Using @GetMapping and stream() to get the Top 3 object:

		@GetMapping("/top3Details")
		public List<Results> getTop3Details() {
			return rs.getTop3Details();
		}

		// Using @getMapping and query to find the object between the totalMarks 70-90:
		
		@GetMapping("/getByMarks")
		public List<Results> getByMarks() {
			return rs.getByMarks();
		}
}