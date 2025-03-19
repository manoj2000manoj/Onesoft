package STREAMTASK;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringRemoveOneCharacter {

	public static void main(String[] args) {
		String name="jeevan";
		char remove='n';
		char remove1='v';
		String result=name.chars()
				.mapToObj(c->(char)c)
				.filter(c->c!=remove&&c!=remove1)
				.map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(result);
				

	}

}
