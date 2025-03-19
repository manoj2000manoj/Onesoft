package STREAMTASK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class Distinct {

	public static void main(String[] args) {
		int a[]= {10,20,30,20,10,80,78,30};
		//int[] array = Arrays.stream(a).distinct().toArray();
		//System.out.println(Arrays.toString(array));
		OptionalInt max = Arrays.stream(a)
				.distinct()
				.sorted()
				.skip(1)
				.findFirst();
		System.out.println(max);
		
	}

}
