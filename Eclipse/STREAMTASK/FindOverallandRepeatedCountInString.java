package STREAMTASK;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class FindOverallandRepeatedCountInString {

	public static void main(String[] args) {
		String a="capgeminii"; 
		long ch1=a.chars().mapToObj(c->(char)c).count();
		System.out.println("OverAll Count: "+ch1);
		
		Map<Object, Long> ch2=a.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(x->x.charValue(),Collectors.counting()));
		System.out.println(ch2);
		
		Map<Object, Object> repeatedChars = ch2.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Repeated Characters: " + repeatedChars);
		
	/*	 String str = "capgeminii";

	        Map<Character, Long> charCount = str.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        System.out.println("Character Count: " + charCount);
	        System.out.println("all Character Count: " + str.length());*/
		

	}

}
