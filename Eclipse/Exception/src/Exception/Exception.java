package Exception;

public class Exception {
	public static void main(String[]args) {
		int a=10;
		int b=20;
		System.out.println(a/b);
		int c=0;
		try {
		System.out.println(b/c);
		}
		catch(ArithmeticException AE) {
			System.out.println(AE);
			System.out.println(AE.getMessage());
			AE.printStackTrace();
		}
		finally {
			System.out.println("final block");
		}
		
	}

}
