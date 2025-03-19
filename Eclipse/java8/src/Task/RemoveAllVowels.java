package Task;

public class RemoveAllVowels {
	public static void main(String[] args) {
		String a="Manojkumar";
		 String result = remove(a);
		 System.out.println(result);
		

	}
	public static String remove(String a) {
		char b[]=a.toCharArray();
		String result = "";
		for(int i=0;i<b.length;i++) {
			char ch = a.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
				result = result+ch;
			}
		}
		return result;
	}

}
