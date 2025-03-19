package functions;

public class UseTotal {
	public static void main(String[]args) {
		total t=new total();
		int[] a= {12,14,15,16,17};
		System.out.println(t.getCount(a));
	}
}
	class total {
		public int getCount(int[] a) {
			int total=0;
			for(int i=0;i<a.length;i++) {
				total=total+a[i];
			}
			return total;
		}
	
}
