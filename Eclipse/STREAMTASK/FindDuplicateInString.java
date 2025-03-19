package STREAMTASK;

import java.text.Collator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInString {

	public static void main(String[] args) {
		String a="JEEVAa";
		Set<Character>duplicate=new HashSet<>();
		List<Character>DuplicateValue=a.chars()
				.mapToObj(c->Character.toUpperCase((char)c)).filter(x->!duplicate.add(x))
				.distinct().collect(Collectors.toList());
		System.out.println(DuplicateValue);

	}

}
