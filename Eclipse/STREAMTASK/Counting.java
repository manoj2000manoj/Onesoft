package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//A collector that counts the number of elements in a stream.
// When you need to count elements in a stream

public class Counting {

	public static void main(String[] args) {
		List<String>name=Arrays.asList("jeeva","manoj","karthi","poovu");
		long count=name.stream().collect(Collectors.counting());
		System.out.println(count);
		long cou=name.stream().count();
		System.out.println(cou);

	}

}
