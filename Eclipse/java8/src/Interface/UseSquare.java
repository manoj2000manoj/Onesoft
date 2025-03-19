package Interface;

public class UseSquare {
	public static void main(String[]args) {
		Square s=a->a*a;  //lambda expression
		System.out.println(s.getSquare(23));
		Square s1=a->a*a*a;
		System.out.println(s1.getSquare(22));
		Myclass mc=new Myclass();
		Square s2=mc::SquareInt;  //method Reference
		System.out.println(s2.getSquare(5));
	}

}
interface Square{
	public int getSquare(int a);
}
class Myclass{
	public int SquareInt(int a) {
		return a*a;
	}
}
