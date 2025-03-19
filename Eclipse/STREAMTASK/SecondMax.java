package STREAMTASK;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondMax {

	public static void main(String[] args) {
		List<Integer>max=Arrays.asList(10,30,45,78,67,90,65);
//		Integer find=max.stream().max(Integer::compare).get();
//		System.out.println(find);
		Optional<Integer> findFirst = max.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(findFirst.get());
		
	}

}
