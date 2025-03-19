package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.API2Pojo;

@RestController
public class APIController {
	@Autowired
	RestTemplate rt;

	@GetMapping(value = "/getWord")
	public String getValue() {
		String url = "http://localhost:8080/WebApp/get";
		ResponseEntity<String> re = rt.exchange(url, HttpMethod.GET, null, String.class);
		String x = re.getBody();
		return x;
	}
	@GetMapping(value="/getNumber/{a}")
	public String getNumber(@PathVariable int a) {
		String url="http://localhost:8080/WebApp/getoddoreven/";
		ResponseEntity<String> re = rt.exchange(url+a, HttpMethod.GET, null, String.class);
		String y = re.getBody();
		return y;
	}
	@GetMapping(value="/getEmployee")
	public List<API2Pojo> getEmployee() {
		String url="http://localhost:8080/emp/ListEmp";
		ResponseEntity<List<API2Pojo>> re = rt.exchange(url, HttpMethod.GET, null,new ParameterizedTypeReference<List<API2Pojo>>() {});
		return re.getBody();
		
	}
	@GetMapping(value="/getSingleEmp/{a}")
	public API2Pojo getSingleEmp(@PathVariable int a) {
		String url="http://localhost:8080/emp/singleEmp/";
		ResponseEntity<API2Pojo> re = rt.exchange(url+a, HttpMethod.GET, null,new ParameterizedTypeReference<API2Pojo>() {} );
		API2Pojo z = re.getBody();
		return z;
		
	}
	

}
