package java8;

public class StaticVariable {
	public static void main(String[]args) {
		System.out.println(StaticV.a);
		StaticV V=new StaticV();
		System.out.println(V.a);
		System.out.println(V.b);
		StaticV V1=new StaticV();
		System.out.println(V1.a);
		System.out.println(V1.b);
		System.out.println(V1.a);
		System.out.println(V1.b);
		System.out.println(V.b);
		System.out.println(V.a);
		
	}

}
class StaticV {
	static int a=10;
	int b=20;
	public StaticV() {
		a++;
		b++;
	}
}
