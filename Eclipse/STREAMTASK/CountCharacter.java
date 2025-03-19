package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountCharacter {

	public static void main(String[] args) {
	/*	List<Character>ch=Arrays.asList('M','J','E','E','V','A');
		Long counting=ch.stream().count();
		System.out.println("The given Character counting is:"+counting);*/
		String a="jeeva";
		Long collect = a.chars().mapToObj(c->(char)c).collect(Collectors.counting());
		System.out.println(collect);

	}

}
 