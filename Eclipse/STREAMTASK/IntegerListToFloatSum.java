package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerListToFloatSum {

	public static void main(String[] args) {
		List<Integer>a=Arrays.asList(10,20,30,43);
		Integer collect = a.stream().collect(Collectors.summingInt(x->x.intValue()));
		float floatValue = collect.floatValue();
		System.out.println(floatValue);

	}

}
