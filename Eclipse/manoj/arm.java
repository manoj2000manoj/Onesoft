package manoj;

public class arm {
	public static void main(String[]args) {
		
		for(int i=150;i<=180;i++) {
			int num=i;
			int tot=num;
			int temp=0;
			while(num>0) {
				int a=i%10;
				int mod=a*a*a;
				temp=temp+mod;
				num=num/10;
			}
			if(tot==temp) {
				
			}
		}
	}


}
