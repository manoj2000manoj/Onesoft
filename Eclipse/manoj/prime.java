package manoj;

public class prime {
	public static void main(String[]args) {
		int a=20;
		int b=100;
		for(int i=a;i<=b;i++) {
			boolean v=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					v=false;
				}
			}
			if(v==true) {
				System.out.println(i);
			}
		}
	}
}
			

			
				
