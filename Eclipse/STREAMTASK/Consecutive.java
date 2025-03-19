package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Consecutive {

	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> collect = nums.stream().filter(x->x!=4&&x!=8&&x!=10).collect(Collectors.toList());
		System.out.println(collect);

	}

}
