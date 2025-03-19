package STREAMTASK;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindStringLength {
	public static void main(String[] args) {
		//String a[]= {"Jeeva","Thiru","Dinesh"};
		String a="jeeva";
		Long collect = a.chars().mapToObj(x->(char)x).collect(Collectors.counting());
		//Long length=Arrays.stream(a).count();
		System.out.println(collect);
				
				
	}
}
