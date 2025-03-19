package manoj;

public class Reverse {
	public static void main(String[]args) {
		String a="abc123def";
		char[] c=a.toCharArray();
		String rev="";
		boolean flag=true;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0' && c[i]<='9'&& flag==true) {
				flag=false;
			}
			else {
				rev=c[i]+rev;
			}
		}
		System.out.println(rev);
	}

}
