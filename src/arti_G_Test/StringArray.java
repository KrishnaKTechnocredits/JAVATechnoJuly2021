package arti_G_Test;

public class StringArray {

	int sumOfString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}

		}
		return sum;
	}

	int sumOfArray(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			sum += sumOfString(input[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		StringArray stringArray = new StringArray();
		System.out.println("Sum of all the digit available in String array :");
		System.out.println(stringArray.sumOfArray(input));
	}
}
