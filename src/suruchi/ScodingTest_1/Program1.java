package suruchi.ScodingTest_1;

public class Program1 {

	int getSumOfDigitsInString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum += Character.getNumericValue(input.charAt(index));
			}
		}
		return sum;
	}

	int getSumOfDigitsInStringArray(String[] arr) {
		int arrayDigitSum = 0;
		for (int index = 0; index < arr.length; index++) {
			arrayDigitSum += getSumOfDigitsInString(arr[index]);
		}
		return arrayDigitSum;
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();

		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };

		System.out.println("Array is as displayed: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");

		System.out.println();
		System.out.print("Sum of all digits available the array is: " + program1.getSumOfDigitsInStringArray(input));
	}
}