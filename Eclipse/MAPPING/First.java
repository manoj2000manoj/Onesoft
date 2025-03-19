package MAPPING;

import java.util.HashMap;
import java.util.Map.Entry;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map=new HashMap<>();
		map.put(101,"jeeva");
		map.put(105,"karthi");
		map.put(104,"lokesh");
		map.put(103,"manoj");
		map.put(102,"hello");
		map.put(106,"hi");
		map.put(108,"bye");
		map.put(107,"oiii");
		map.put(109,"deiii");
		map.put(100,"mrng");
		map.put(199,"night");
		map.put(198,"even");
		map.put(197,"after");
		map.put(102, "hellohellohello");
		map.put(102, "hellohellohelloworld");
		//map.remove(0);
		map.put(101, "pradeep");
//		System.out.println(map.get(101));
//		System.out.println(map);
//		System.out.println(map.values());//get the values for given map
//		//for each loops  get the value of key and values
//		map.forEach((x,y)->System.out.println(x+" "+y));
//		//for eaxh loops get the all values
//		map.values().forEach(a->System.out.println(a));
//		//for-eachloops using keyset to get the key and value this is bonus for using keyset methoad we got values also
//		map.keySet().forEach(b->{
//			System.out.println(b+" "+map.get(b));
//		});
		
		//enhanced for 
		for(Integer x:map.keySet()) {
			System.out.println(x);
		}
		for(String x:map.values()) {
			System.out.println(x);
		}
		for(Entry<Integer, String> x:map.entrySet()) {
			System.out.println(x);
		}
		

	}

	

}
