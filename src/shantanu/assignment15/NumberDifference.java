package shantanu.assignment15;

public class NumberDifference {
	int findDifference(int[] arr) {
		int evenSum = 0, oddSum = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] % 2 == 0)
				evenSum += arr[index];
			else
				oddSum += arr[index];
		}
		if(evenSum > oddSum)
			return evenSum - oddSum;
		else
			return oddSum - evenSum;
	}
	
	int createArray() {
		int[] input = {13,22,10,3};
		return findDifference(input);
	}
	
	int displayDifference() {
		return createArray();
	}
	
	public static void main(String args[]) {
		NumberDifference numberDifference = new NumberDifference();
		System.out.println("Difference between sum of even numbers and sum of odd numbers is: "+numberDifference.displayDifference());
	}
}
