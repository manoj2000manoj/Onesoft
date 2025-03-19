package STREAMTASKREVIEW;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveTheLastCharEndsWithA {

	public static void main(String[] args) {
		List<String>r=Arrays.asList("jeeva","manoj","karthik");
		Iterator<String> iterator = r.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("a"))
				iterator.remove();
			
			
		}
		System.out.println(r);

	}

}
