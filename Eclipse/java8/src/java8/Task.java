package java8;

public class Task {
 public void findEvenNumbers(int[] arr) {
        System.out.print("Even Numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

public void findOddNumbers(int[] arr) {
    System.out.print("Odd Numbers: ");
        for (int num : arr) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

	
public void findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum Value: " + min);
    }
	
	public void findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Minimum Value: " + max);
    }
}


 
