package manoj;

public class Palindrome {
	public static void main(String[]args) {
		for(int i=101;i<=999;i++) {
		int num=i;
		int org=num;
		int temp=0;
		while(num>0) {
			int a=num%10;
			temp=(temp*10)+a;
			num=num/10;
		}
		if(org==temp) {
			System.out.println(temp);

		}
	}

}
}
