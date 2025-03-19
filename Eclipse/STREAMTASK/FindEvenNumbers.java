package STREAMTASK;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {

	public static void main(String[] args) {
		List<Integer>Even=Arrays.asList(25,67,88,44,35,12);
		List<Integer>find=Even.stream().filter(x->x%2==0).collect(Collectors.toList());
		find.forEach(x->System.out.println("The given List Array Even Numbers:"+x));
		System.out.println("The given List Array Even Numbers:"+find);

	}

}
