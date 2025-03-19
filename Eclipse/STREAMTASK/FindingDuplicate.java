package STREAMTASK;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicate {

	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(10,20,30,10,25,25);
		Set<Integer>duplicate=new HashSet<>();
		List<Integer> collect = li.stream().filter(x->!duplicate.add(x)).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
