package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.MarkDao;
import com.example.demo.entity.MarkSheet;
@Service
public class MarkService {
	@Autowired
	MarkDao md;

	public String postAllDetails(List<MarkSheet> m) {
		for (MarkSheet mrs : m) {
			mrs.setSem1Total(mrs.getSem1Theory() + mrs.getSem1Practicals());
			mrs.setSem2Total(mrs.getSem2Theory() + mrs.getSem2Practicals());
		}
		return md.postAllDetails(m);
	}
		
	

	public List<MarkSheet> getAll() {
		return md.getAll();
	}



	



	public String deleteAll() {
		
		return md.deleteAll();
	}

}
