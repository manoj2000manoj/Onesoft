package functionsTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class VowelsCharacter {
	public static void main(String[]args) {
		Vowels v=new Vowels();
		v.name("Manojkumar");
	}

}
class Vowels {
	public void name(String name) {
		System.out.println(name.chars().mapToObj(x->(char)x).filter(c->(char)c=='A'||c=='E'||c=='O'||c=='I'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u').map(String::valueOf).collect(Collectors.joining(",")));
			}
}
		
	

 