package Exception;

public class Null {
	public static void main(String[]args) {
		String a=null;
		try {
		String b=a.toUpperCase();
		}
		catch(NullPointerException np) {
			System.out.println(np);
			System.out.println(np.getMessage());
			np.printStackTrace();
		}
		finally {
			System.out.println("Manoj");
		}
	}
}
	
		


