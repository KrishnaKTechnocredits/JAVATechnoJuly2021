package shantanu.assignment14;

public class DiffMaxAndMin {
	int findMaxMinDifference(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(max < arr[index])
				max = arr[index];
			if(min > arr[index])
				min = arr[index];
		}
		return max-min;
	}
	
	int createArray() {
		int[] input = {1,11,44,23,55,99,23};
		return findMaxMinDifference(input);
	}
	
	void displayMaxMinDifference() {
		System.out.println("Difference between maximum and minimum numbers of the array is: "+createArray());
	}
	
	public static void main(String[] args) {
		DiffMaxAndMin diffMaxAndMin = new DiffMaxAndMin();
		diffMaxAndMin.displayMaxMinDifference();
	}
}
