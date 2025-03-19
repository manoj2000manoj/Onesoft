package task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[]args) {
		List<Integer>nums=Arrays.asList(10,20,30,10,25);
		HashSet<Integer>duplicat=new HashSet<>();
	    List<Integer> duplicateValues=nums.stream().filter(x->!duplicat.add(x)).collect(Collectors.toList());
		System.out.println(duplicateValues);
		System.out.println(duplicat);
		

}
}