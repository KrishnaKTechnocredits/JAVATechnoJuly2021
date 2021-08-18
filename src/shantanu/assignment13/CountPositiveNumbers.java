package shantanu.assignment13;

public class CountPositiveNumbers {

	int findCountOfPositiveNumbers(int[] arr) {
		int count = 0;
		for(int index=0; index < arr.length; index++) {
			if(arr[index] > 0)
				count++;
		}
		return count;
	}
	
	int createArray() {
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		return findCountOfPositiveNumbers(input);
	}
	
	void displayCountOfPositiveNumbers() {
		System.out.println("Count of positive numbers is: "+createArray());
	}
	
	public static void main(String[] args) {
		CountPositiveNumbers countPositiveNumbers = new CountPositiveNumbers();
		countPositiveNumbers.displayCountOfPositiveNumbers();
	}
}
