package STREAMTASK;

import java.util.Arrays;
import java.util.List;

//MAY PRINT THE DIFFRENT ORDER--------->

public class Parallelstream {

	public static void main(String[] args) {
		List<String>name=Arrays.asList("jeeva","thiru","dinesh");
		name.parallelStream().forEach(x->System.out.println(x));

	}

}
