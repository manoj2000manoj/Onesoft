package java8;

public class StaticMethod {
	public static void main(String[]args) {
		System.out.println(Static.getName());
	}

}
class Static {
	public static String getName() {
		return "Hari";
	}
}

//class ST1 extends Static {
//	public String getName() {
		//return"Hari"+"R";
	//}
//}
