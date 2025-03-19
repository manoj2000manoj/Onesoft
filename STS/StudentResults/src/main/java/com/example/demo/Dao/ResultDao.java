package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.ResultRepository;
import com.example.demo.entity.Results;
import com.example.demo.pojo.MarkDetailsPojo;
import com.example.demo.pojo.StudentDetailsPojo;

@Repository
public class ResultDao {
	@Autowired
	ResultRepository rr;
	@Autowired
	RestTemplate rt;

	public String fullDetails() {

		// Using @PostMapping to get the totalMarks and Percentage for all objects:

		String url1 = "http://localhost:8087/student/getDetails";// student have attendance
		String url2 = "http://localhost:8088/marksheet/getAllMarkSheet";// markSheet value

		ResponseEntity<List<StudentDetailsPojo>> res1 = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentDetailsPojo>>() {
				});
		ResponseEntity<List<MarkDetailsPojo>> res2 = rt.exchange(url2, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<MarkDetailsPojo>>() {
				});
		List<StudentDetailsPojo> studetails = res1.getBody();
		List<MarkDetailsPojo> sheet = res2.getBody();
		List<Results> resultsList = new ArrayList<>();

		for (StudentDetailsPojo student : studetails) {
			MarkDetailsPojo markSheet = sheet.stream().filter(m -> m.getRollNumber() == student.getRollNumber())
					.findFirst().orElse(null);

			if (markSheet != null) {
				int totalMarks = (markSheet.getSem1Total() + markSheet.getSem2Total()) / 2;

				// Add 5 marks if attendance is 90% or more (capped at 100)
				if (student.getAttendance() >= 90) {
					totalMarks = Math.min(totalMarks + 5, 100);
				}

				double percentage = (totalMarks / 100.0) * 100;

				Results result = new Results();
				result.setRollNumber(student.getRollNumber());
				result.setName(student.getName());
				result.setTotalMarks(totalMarks);
				result.setPercentage(percentage);

				resultsList.add(result);
			}
		}
		rr.saveAll(resultsList);
		return "saved";
	}

	// using @GetMapping to get the Toper from the table details:

	public Results getTopperByMark() {
		// if we use stream means no need to write query:
//		return rr.findAll().stream().max(Comparator.comparing(Result::getTotalMarks)).get();
		return rr.getTopperByMark();
	}

	// Using @GetMapping and stream() to get the Top 3 object:

	public List<Results> getTop3Details() {
		return rr.findAll().stream().sorted(Comparator.comparing(Results::getTotalMarks).reversed()).limit(3).toList();
	}

	// Using @getMapping and query to find the object between the totalMarks 70-90:

	public List<Results> getByMarks() {
		return rr.getByMarks();
	}
}
