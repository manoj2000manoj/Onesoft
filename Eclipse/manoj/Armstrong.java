package manoj;

public class Armstrong {
	public static void main(String[]args) {
		for(int i=150;i<=180;i++) {
	      int num=i;
	      int org=num;
	      int temp=0;
	      while(num>0) {
		      int mod=num%10;
		      int cube=mod*mod*mod;
		      temp=cube+temp;
		      num=num/10;
	          }
	          if(org==temp) {
		         System.out.println(temp);
	          }
		}
	}
}
	



	
	


