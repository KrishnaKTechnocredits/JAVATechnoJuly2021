package madhavi;

public class Assignment_22_2 {
	int sum = 0;

	int GetSumOfTheDigits(String input) {
		for (int index = 0; index < input.length(); index++) {
			// char ch = input.charAt(index);
			// boolean isDigit = Character.isDigit(input.charAt(index));
			if (Character.isDigit(input.charAt(index))) {
				sum += Character.getNumericValue(input.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sum of all the digits in a given string. ");
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println(new Assignment_22_2().GetSumOfTheDigits(str));
	}

}
