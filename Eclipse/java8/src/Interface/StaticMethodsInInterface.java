package Interface;

public class StaticMethodsInInterface {
	public static void main(String[]args) {
		SM s=new SM();
		System.out.println(s.getName("Manoj"));
		System.out.println(s.getAge(25));
	}

}
interface StaticMethod{
	public default String getName(String name) {
		return name;
	}
	public static int getAge(int age) {
		return age;
	}
}
class SM implements StaticMethod{
	public String getName(String name) {
		return name+"M";
	}
	public int getAge(int age) {
		return age;
	}
}