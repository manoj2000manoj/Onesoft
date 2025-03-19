package STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NonDuplicateFirstchar {

	public static void main(String[] args) {
		String a="jeevaa";
		Map<Character,Long> collect = a.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x.charValue(),Collectors.counting()));
		Optional<Character> findFirst = a.chars().mapToObj(x->(char)x).filter(x->collect.get(x)==1).findFirst();
		System.out.println(findFirst.get());
		
		List<Character>ch=Arrays.asList('M','J','M','E','V','A');
		Map<Character,Long> collect2 = ch.stream().collect(Collectors.groupingBy(x->x.charValue(),Collectors.counting()));
		Character character = ch.stream().filter(x->collect2.get(x)==1).findFirst().get();
		System.out.println(character);
		
		
		

	}

}
