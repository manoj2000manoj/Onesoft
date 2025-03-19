package Task;

public class FindMaxIn {
	public static void main(String[] args) {
		char arr[]= {'A', 'b', 'c', 'D', 'e', 'f', 'G', 'h'};
		findmaxLowerCount(arr);

	}

	public static void findmaxLowerCount(char[] arr) {
		char maxChar = '0';
		int maxCount = 0;
		for(int i=0;i<arr.length;i++) {
			if(Character.isLowerCase(arr[i])) {
				maxChar =arr[i];
				maxCount++;
			}
		}
		System.out.println(maxChar+" "+maxCount);
		
	}

}
