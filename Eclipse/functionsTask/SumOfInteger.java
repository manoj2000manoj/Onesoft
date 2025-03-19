package functionsTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfInteger {
	public static void main(String[]args) {
		List<Integer>sum=Arrays.asList(2,3,4,5,6,7,8,9);
		Sum s=new Sum();
		System.out.println(s.addition(sum));
		
	}

}
class Sum {
	public int addition(List<Integer>sum) {
		Integer total=sum.stream().collect(Collectors.summingInt(x->x));
		return total;
		
	}
}
