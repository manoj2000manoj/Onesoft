package manoj;

public class For3 {
	public static void main(String[]args) {
		String a="hello";
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			int count=0;
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					count++;
					b[j]='$';
					
				}
			}
			if(count>0 && b[i]!='$') {
				System.out.println(b[i]+" "+count);
			}
		}
	}

}
