package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinThreeListIntoSingleList {

	public static void main(String[] args) {
		List<Integer>li1=Arrays.asList(1,2,3,4,5,6);
		List<Integer>li2=Arrays.asList(7,8,9,10,11);
		List<Integer>li3=Arrays.asList(12,13,14,15);
		List<List<Integer>>lis=Arrays.asList(li1,li2,li3);
		List<Integer>join=lis.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(join);
				

	}

}
