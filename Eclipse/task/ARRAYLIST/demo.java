package ARRAYLIST;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		String a[]=args[0].split(",");
		char a1=a[0].charAt(0);
		char a2=a[1].charAt(0);
		char a3=a[2].charAt(0);
		ArrayList<Character>words=new ArrayList<>();
		words.add(a1);
		words.add(a2);
		words.add(a3);
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i));
		}
		
		

	}

}
