package shantanu.codingTest1;

public class SumOfAllDigitsInStringArray {
	int getSumOfAllDigitsInString(String str) {
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				sum += Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}
	int getSumOfAllDigitsInStringArray(String[] input) {
		int sum = 0;
		for(int index = 0; index < input.length; index++) {
			sum += getSumOfAllDigitsInString(input[index]);
		}
		return sum;
	}
	void displaySumOfAllDigitsInStringArray(String[] input) {
		System.out.println("Sum of all digits in the string array is: "+getSumOfAllDigitsInStringArray(input));
	}
	public static void main(String[] args) {
		SumOfAllDigitsInStringArray sumOfAllDigitsInStringArray = new SumOfAllDigitsInStringArray();
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		sumOfAllDigitsInStringArray.displaySumOfAllDigitsInStringArray(input);
	}
}
