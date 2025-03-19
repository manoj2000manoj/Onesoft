package java8;

import java.util.Optional;

public class Optionals {
	public static void main(String[]args) {
		String a=null;
		String b="abc";
		Optional<String>b1=Optional.of(b);
		System.out.println(b1);
		Optional<String>a1=Optional.ofNullable(a);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.isPresent());
		String b2=b1.orElse("bcd");
		String a2=a1.orElse("Hari");
		System.out.println(a2);
		System.out.println(b2);
		String b3=b1.orElseThrow();
		String b4=a1.orElseThrow();
		String b5=a1.orElseThrow(()-> new ArithmeticException());
		
	}

}
