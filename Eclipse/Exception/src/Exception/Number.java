package Exception;

public class Number {
	public static void main(String[]args) {
		String name="hari12";
		
		try {
			int a=Integer.parseInt(name);
		System.out.println(a);
		}
		catch(NumberFormatException nf) {
			System.out.println(nf);
			System.out.println(nf.getMessage());
			nf.printStackTrace();
		}
		finally {
			System.out.println("final block");
		}
	}

}
