package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntArraySorting {

	public static void main(String[] args) {
		int a[]= {10,40,20,50,70,30,60};
		int[] array = Arrays.stream(a).sorted().toArray();
		System.out.println(Arrays.toString(array));

	}

}
