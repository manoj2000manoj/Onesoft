package java8;

public class Methodref {
	 public static void main(String[] args) {
				int a[]= {5, 12, 7, 3, 10, 15, 20, 25, 30};
				Task obj = new Task();
				ArrayProcess even= obj::findEvenNumbers;
				ArrayProcess Odd= obj::findOddNumbers;
				ArrayProcess Max= obj::findMax;
				ArrayProcess Min= obj::findMin;
				
				even.process(a);
				Odd.process(a);
				Max.process(a);
				Min.process(a);

			}

		}

interface ArrayProcess {
			abstract void process(int []arr);
}



