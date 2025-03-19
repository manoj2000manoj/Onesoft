package functions;

public class UseMax {
	public static void main(String[]args) {
		Max m=new Max();
		System.out.println(m.max(10,20,30));
		System.out.println(m.min(40, 60, 70));
	}
	
}
	class Max {
		public int max(int a,int b,int c) {
			if(a>b && a>c){
				return a;
			}
			else if(b>c) {
				return b;
			}
			else {
				return c;
			}
			
		}
		public int min(int a,int b,int c) {
			if(a<b && a<c) {
				return a;
			}
			else if(b<c){
				return b;
			}
			else {
				return c;
			}

}
	}
