package STREAMTASK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdMax {

	public static void main(String[] args) {
		List<Integer>ThirdMax=Arrays.asList(20,43,18,45,89,79,65,76);
		Integer find=ThirdMax.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
		System.out.println("Third Max Value is:"+find);
		

	}

}
