package ARRAYLIST;


import java.util.ArrayList;
import java.util.Iterator;

public class Lms1 {

	public static void main(String[] args) {
		ArrayList<String>value=new ArrayList<>();
		value.add("sun");
		value.add("moon");
		value.add("earth");
		value.add("Global");
		int count=0;
//		Iterator<String>v=value.iterator();
//		while(v.hasNext()) {
//			System.out.print(v.next());
//			count++;
//			if(count<4)
//				System.out.println(",");
////			if(v.hasNext())
////				System.out.print(",");
//		}
		Iterator<String> iterator = value.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
