package ARRAYLIST;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		ArrayList<Integer> prime=new ArrayList<>();
		prime.add(11);
		prime.add(2);
		prime.add(5);
		prime.add(4);
		prime.add(3);
		prime.add(13);
		for(int i=0;i<prime.size();i++) {
			boolean a= true;
			for(int j=2;j<prime.get(i);j++) {
				if(prime.get(i)%j==0)
					a=false;
			}
			if(a==true)
				System.out.println(prime.get(i));
		}

	}

}
