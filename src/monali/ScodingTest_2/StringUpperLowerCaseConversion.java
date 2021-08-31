package monali.ScodingTest_2;

public class StringUpperLowerCaseConversion {

	void convertStringUpperLower(String input) {
		String convertedString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch))
				convertedString += Character.getNumericValue(ch);
			else if (Character.isUpperCase(ch))
				convertedString += Character.toLowerCase(ch);
			else if (Character.isLowerCase(ch))
				convertedString += Character.toUpperCase(ch);
		}

		System.out.println("Original String : " + input + "\nConverted String : " + convertedString);
	}

	public static void main(String[] args) {
		String input = "A1ashVi6";
		new StringUpperLowerCaseConversion().convertStringUpperLower(input);
	}
}
