package com.Electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	@Query(value = "select * from mobile_details where colour=?", nativeQuery = true)
	public List<Mobile> getColour(String s);

	@Query(value = "select * from mobile_details where brand=?", nativeQuery = true)
	public List<Mobile> getBrand(String a);

	@Query(value = "select * from mobile_details where brand like concat(?,'%')", nativeQuery = true)
	public List<Mobile> getBrandStarts(String m);

	@Query(value = "select * from mobile_details where storage between ? and ?", nativeQuery = true)
	public List<Mobile> getStorage(int o, int p);

	@Query(value = "select * from mobile_details where year between ? and ?", nativeQuery = true)
	public List<Mobile> getYear(int k, int j);
	@Query(value = "select * from mobile_details where price between ? and ?", nativeQuery = true)
	public Mobile getPrice(int g, int h);
	

}
