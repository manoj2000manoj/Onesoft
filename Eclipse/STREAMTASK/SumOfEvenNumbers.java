package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		List<Integer>num=Arrays.asList(23,45,65,22,44,2);
		int sum=num.stream().collect(Collectors.summingInt(a->a));
		System.out.println("Total Sum: "+sum);
		Integer evensum=num.stream().filter(a->a%2==0).collect(Collectors.summingInt(a->a));
		System.out.println("EvenSum:"+evensum);

	}

}
