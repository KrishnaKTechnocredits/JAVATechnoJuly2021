package shantanu.assignment14;

public class MinNumberArray {
	int findMinNumber(int[] arr) {
		int min = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(min > arr[index])
				min = arr[index];
		}
		return min;
	}
	
	int createArray() {
		int[] input = {1,11,44,23,55,99,23};
		return findMinNumber(input);
	}
	
	void displayMinNumberFromArray() {
		System.out.println("Minimum number from the array is: "+createArray());
	}
	
	public static void main(String[] args) {
		MinNumberArray minNumberArray = new MinNumberArray();
		minNumberArray.displayMinNumberFromArray();
	}
}
