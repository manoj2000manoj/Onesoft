package ARRAYLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class First {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            list.add("C"); // 🚨 Modifying during iteration
            System.out.println(it.next()); // 
        }
//		System.out.println("Size is:"+num.size());
//		for(int i=0;i<num.size();i++) {
//			System.out.println(num.get(i));
//		}
//		System.out.println("-------------------");
//		for(Integer x:num) {
//			System.out.println(x);
//		}
		
		
	}

}
