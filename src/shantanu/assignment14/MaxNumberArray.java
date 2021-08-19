package shantanu.assignment14;

public class MaxNumberArray {
	int findMaxNumber(int[] arr) {
		int max = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(max < arr[index])
				max = arr[index];
		}
		return max;
	}
	
	int createArray() {
		int[] input = {1,11,44,230,55,99,23};
		return findMaxNumber(input);
	}
	
	void displayMaxNumberFromArray() {
		System.out.println("Maximum number from the array is: "+createArray());
	}
	
	public static void main(String[] args) {
		MaxNumberArray maxNumberArray = new MaxNumberArray();
		maxNumberArray.displayMaxNumberFromArray();
	}
}
