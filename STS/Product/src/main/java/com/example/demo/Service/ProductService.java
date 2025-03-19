package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

import jakarta.websocket.server.ServerEndpoint;
@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	public String postValue(List<Product> a) {
		
		return pd.postValue(a);
	}

	public List<Product> getValue() {
		
		return pd.getValue();
	}

	public String deleteValue() {
		
		return pd.deleteValue();
	}

}
