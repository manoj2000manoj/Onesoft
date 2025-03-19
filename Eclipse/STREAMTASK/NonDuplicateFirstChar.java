package STREAMTASK;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NonDuplicateFirstChar {

	/*public static void main(String[] args) {
		List<Character>ch=Arrays.asList('E','J','E','E','V','A');
		Optional<Character> first=ch.stream().distinct().findFirst();
		System.out.println(first);
	}*/
	public static void main(String[] args) {
		List<Character>ch=Arrays.asList('M','J','M','E','V','A');
		Map<Character, Long>group=ch.stream()
				.collect(Collectors.groupingBy(x->x.charValue(),Collectors.counting()));
		System.out.println(group);
		Optional<Character>first=ch.stream()
				.filter(x->group.get(x)==1)
				.findFirst();
		System.out.println(first.orElse(null));
	
		String a="mjeemavana";
		Map<Character, Long>gro=a.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c.charValue(),Collectors.counting()));
		Optional<Character>findFirst=a.chars().mapToObj(c->(char)c)
				.filter(x->gro.get(x)==1).findFirst();
		System.out.println("The given String First non Duplicate value is: "+findFirst.get());
		
		Optional<Character>findSecond=a.chars().mapToObj(c->(char)c)
				.filter(x->gro.get(x)==1).skip(1).findFirst();
		System.out.println("The given String Second non Duplicate value is: "+findSecond.get());
		
		Optional<Character>findThird=a.chars().mapToObj(c->(char)c)
				.filter(x->gro.get(x)==1).skip(4).findFirst();
		System.out.println("The given String First non Duplicate value is: "+findThird.orElse(null));
	}


}
