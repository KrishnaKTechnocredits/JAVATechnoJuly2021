package varun.varun_array_assignment;

public class DifferenceBetweenOddEvenFromGivenArray {
	int maxEven = 0;
	int maxOdd = 0;
	void maxEvenNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				if (input[index] > maxEven)
					maxEven = input[index];
			}
		}
		System.out.println("Max Even Number from the given array is " +maxEven);
	}
	
	void maxOddNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 != 0) {
				if (input[index] > maxOdd)
					maxOdd = input[index];
			}
		}
		System.out.println("Max Odd Number from the given array is " +maxOdd);
	}
	
	void differenceOfMaxEvenAndOdd() {
		int diff = maxOdd-maxEven;
		System.out.println("Difference of Max even number and Odd number is " +diff);
	}
	
	public static void main(String[] args) {
		DifferenceBetweenOddEvenFromGivenArray assignment14_4 = new DifferenceBetweenOddEvenFromGivenArray();
		int[] input = {1,11,44,23,55,99,23,22};
		assignment14_4.maxEvenNumber(input);
		assignment14_4.maxOddNumber(input);
		assignment14_4.differenceOfMaxEvenAndOdd();
	}
}
