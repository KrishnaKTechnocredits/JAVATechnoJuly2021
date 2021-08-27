package shantanu.assignment13;

public class SmallerNumbers {
	int[] findFiveSmallerNumbers(int num) {
		int[] arr = new int[5];
		int count = 0;
		for(int index = 0; index < arr.length; index++) {
			if(count >= 5)
				break;
			else {
				arr[index] = --num;
				count++;
			}	
		}
		return arr;
	}
	
	void displayFiveSmallerNumbers(int num) {
		int[] arr = findFiveSmallerNumbers(num);
		System.out.println("Five smaller numbers than "+num+" are:");
		for(int index = 0; index < arr.length; index++)
			System.out.println(arr[index]);
	}
	
	public static void main(String[] args) {
		SmallerNumbers smallerNumbers = new SmallerNumbers();
		smallerNumbers.displayFiveSmallerNumbers(50);
	}
}
