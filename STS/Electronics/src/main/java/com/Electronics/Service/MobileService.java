package com.Electronics.Service;

import java.util.List;

import javax.management.AttributeNotFoundException;
import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Electronics.Dao.MobileDao;
import com.Electronics.Exception.BrandNotFoundException;
import com.Electronics.Exception.ColourNotFoundException;
import com.Electronics.Exception.ModelNotFoundException;
import com.Electronics.Exception.PriceNotFoundException;
import com.Electronics.Exception.StorageNotFoundException;
import com.Electronics.Exception.YearNotFoundException;
import com.Electronics.entity.Mobile;

@Service
public class MobileService {

	@Autowired
	MobileDao md;

	public String postmethodname(List<Mobile> m) {
		return md.postmethodname(m);
	}

	public List<Mobile> getall() {
		return md.getall();
	}

	public List<Mobile> getColour(String a) throws ColourNotFoundException {
		if (md.getColour(a).isEmpty()) {
			throw new ColourNotFoundException("Colour not found");
		} else {
			return md.getColour(a);
		}
	}
	public List<Mobile> getBrand(String s) throws BrandNotFoundException {
		if (md.getBrand(s).isEmpty()) {
			throw new BrandNotFoundException("Brand not found");
		} else {
			return md.getBrand(s);
		}
	}
	public List<Mobile> getBrandStarts(String m) throws ModelNotFoundException {
		if(md.getBrandStarts(m).isEmpty()) {
			throw new ModelNotFoundException("Brand Starts not with Z");
		}else {
			return md.getBrandStarts(m);
		}
	}


	public List<Mobile> getStorage(int o,int p)  throws StorageNotFoundException {
		if(md.getStorage(o, p).isEmpty()) {
			throw new StorageNotFoundException("Storage between 64 and 256");
		}
		else {
		   return md.getStorage(o,p);
	}
	}
	public List<Mobile> getYear(int k,int j) throws YearNotFoundException {
		if(md.getYear(k, j).isEmpty()) {
			throw new YearNotFoundException("no such year in record");
		}
		else {
		   return md.getYear(k,j);
	}
	}

	

	public Mobile getPrice(Mobile m) throws PriceNotFoundException {
		if(m.getPrice()>800)  { 
			throw new PriceNotFoundException("no such year in record");
		  	}
		else {
			 return md.getPrice(m);
		}
			
		}

}

