package STREAMTASKREVIEW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerThreeListIntoOneList {

	public static void main(String[] args) {
		List<Integer>a=Arrays.asList(10,25,30);
		List<Integer>b=Arrays.asList(40,50,60);
		List<Integer>c=Arrays.asList(70,80,90);
		List<List<Integer>>abc=Arrays.asList(a,b,c);
		List<Integer>res=abc.stream()
				.flatMap(x->x.stream())
				.collect(Collectors.toList());
		System.out.println(res);
	}

}
