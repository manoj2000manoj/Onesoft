package ARRAYLIST;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
	}
	
}
