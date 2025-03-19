package functions;

public class Task {
	public static void main(String[]args) {
		Maths m=new Maths();
		m.add(5,2);
		System.out.println(m.sub(5,2));
		System.out.println(m.mul(2,5));
		System.out.println(m.div(8,4));
	}
}
	class Maths {
		public void add(int a,int b) {
			System.out.println(a+b);
			
		}
		public int sub(int a,int b) {
			return a+b;
		}
		public int mul(int a,int b) {
			return a*b;
		}
		public int div(int a,int b) {
			return a/b;
		}
	}


