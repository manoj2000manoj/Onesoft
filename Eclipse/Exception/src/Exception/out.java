package Exception;

public class out {
	public static void main(String[]args) {
		String name="manoj";
	
		
		try {
			char ch=name.charAt(5);
		}
		catch(StringIndexOutOfBoundsException np) {
			System.out.println(np);
			System.out.println(np.getMessage());
			np.printStackTrace();
		}
		finally {
			System.out.println("Manoj");
		}
	}

}
