package STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer>num1=Arrays.asList(10,20,30,40);
		List<Integer>num2=Arrays.asList(50,60,70,80);
		List<Integer>num3=Arrays.asList(50,60,70,80);
		List<String>nums1=Arrays.asList("jeeva","thiru","dinesh");
		List<Double>a=Arrays.asList(1.2,2.3,5.6);
		//List<List<Integer>>num4=Arrays.asList(num1,num2,num3,nums1);
		List<List<? extends Object>>num4=Arrays.asList(num1,num2,num3,nums1,a);
		System.out.println(num4);
		//List<Integer>nums=num4.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		List<Integer>nums=(List<Integer>) num4.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(nums);
	}

}
