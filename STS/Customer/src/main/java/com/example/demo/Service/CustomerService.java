package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Dao.CustomerDao;
import com.example.demo.entity.Customer;
@Service

public class CustomerService {
	@Autowired
	CustomerDao cd;

	public String postAll(List<Customer> a) {
		
		return cd.postAll(a);
	}
	@Autowired
	RestTemplate rt;                                     
	public String PostBranch(List<Customer> a) {
		String url= "http://localhost:8084/bank/getDetailsByIfscCode/";
		a	.forEach(x->{
			String ifsc = x.getIfscCode();
			ResponseEntity<String> res = rt.exchange(url+ifsc, HttpMethod.GET,null,
					new ParameterizedTypeReference<String>() {});
			String branch = res.getBody();
			x.setBranch(branch);
		});
		return cd.PostBranch(a);
		
	}

}
