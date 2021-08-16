package shantanu.assignment14;

public class DiffMaxOddAndMaxEven {
	int findDiffMaxOddAndMaxEven(int[] arr) {
		int maxOdd = arr[0];
		int maxEven = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(maxOdd < arr[index]) {
				if(arr[index] % 2 != 0)
					maxOdd = arr[index];
			}
			if(maxEven < arr[index]) {
				if(arr[index] % 2 == 0)
					maxEven = arr[index];
			}
		}
		if(maxOdd > maxEven)
			return maxOdd - maxEven;
		else
			return maxEven - maxOdd;
	}
	
	int createArray() {
		int[] input = {1,11,44,23,55,99,23,22};
		return findDiffMaxOddAndMaxEven(input);
	}
	
	void displayMaxOddAndMaxEvenDiff() {
		System.out.println("Difference between maximum odd number and maximum even number from the array is: "+createArray());
	}
	
	public static void main(String[] args) {
		DiffMaxOddAndMaxEven diffMaxOddAndMaxEven = new DiffMaxOddAndMaxEven();
		diffMaxOddAndMaxEven.displayMaxOddAndMaxEvenDiff();
	}
}
