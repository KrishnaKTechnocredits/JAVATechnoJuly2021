package nasir_ScodingTest_1;

public class SumDigits {
	int sumOfDigits(String input) {
		int sum = 0;
		for(int index=0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				sum += Character.getNumericValue(input.charAt(index));
			}
		return sum;
		}
	int geSumOfDigitsInArray(String[] input) {
		int totalSum =0;
		for(int index=0; index<input.length; index++)
			totalSum += sumOfDigits(input[index]);
		return totalSum;
	}

	public static void main(String[] args) {
		SumDigits sumOfDigits = new SumDigits();
		String[] inputArray = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Sum = "+sumOfDigits.geSumOfDigitsInArray(inputArray));

	}

}
