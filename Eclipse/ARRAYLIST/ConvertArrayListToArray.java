package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		// With built-in function
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
		String[] arr = list.toArray(new String[0]);

		// Without built-in function
		String[] arr2 = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
		    arr2[i] = list.get(i);
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));

	}

}
