package Exception;

public class MultipleCatch {
	public static void main(String[]args) {
		String []name= {"jeeva","manoj","karthi","pradeep"};
		try {
		//String name1=name[4];
		char ch=name[3].charAt(7);
		}
	    catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException ne) {
			System.out.println(ne);
			System.out.println(ne.getMessage());
			ne.printStackTrace();
		}
		finally {
			System.out.println("manoj");
		}
	}

}
