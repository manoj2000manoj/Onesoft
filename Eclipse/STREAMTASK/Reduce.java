package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream().reduce(2, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
        
        int suming=numbers.stream().collect(Collectors.summingInt(a->a));
        System.out.println(suming);
	}

}
