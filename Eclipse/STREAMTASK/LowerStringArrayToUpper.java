package STREAMTASK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LowerStringArrayToUpper {

	public static void main(String[] args) {
		String a[]= {"abc","xyz","abd","heg"};
		String b=Arrays.stream(a).map(String::toUpperCase).collect(Collectors.joining("\", \"", "{\"", "\"}"));
		System.out.println(b);
	}

}
