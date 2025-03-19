package functions;


public class UseDetails {
	public static void main(String[]args) {
		Details d=new Details();
		d.name("raghu");
		d.age();
		System.out.println(d.qualification("B.E.CSE"));
		System.out.println(d.passedout());
	}
}
	
	class Details {
		public void name(String name) {
			System.out.println(name);
		}
		public void age() {
			System.out.println("23");
		}
		public String qualification(String qualification) {
			return qualification;
		}
		public int passedout() {
			return 2023;
		}
	}


