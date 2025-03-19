package Exception;

public class Array {
	public static void main(String[]args) {
		int[] name= {10,12,13,14};
	
		
		try {
			int num1=name[8];
		}
		catch(ArrayIndexOutOfBoundsException np) {
			System.out.println(np);
			System.out.println(np.getMessage());
			np.printStackTrace();
		}
		finally {
			System.out.println("Manoj");
		}
	}

}
