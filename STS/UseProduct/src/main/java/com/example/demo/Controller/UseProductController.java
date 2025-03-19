package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.ProductPojo;

@RestController
@RequestMapping(value="/useproduct")
public class UseProductController {
	@Autowired
	RestTemplate rt;
	@GetMapping(value="/getAllProductsWithGST")
	public List<ProductPojo>getAllProduct() {
		String url1="http://localhost:8081/product/getValue";
		String url2="http://localhost:8082/GST/getPercentage/";
		
		ResponseEntity<List<ProductPojo>> re1=rt.exchange(url1, HttpMethod.GET,null,new ParameterizedTypeReference<List<ProductPojo>>() {});
		List<ProductPojo>products=re1.getBody();
		products.forEach(x->{
			int hsn=x.getHsncode();
			ResponseEntity<Integer> re2=rt.exchange(url2+hsn, HttpMethod.GET,null,Integer.class);
			Integer percent=re2.getBody();
			x.setPrice(x.getPrice()+(x.getPrice()*percent/100));
		});
		return products;
		
	}

}
