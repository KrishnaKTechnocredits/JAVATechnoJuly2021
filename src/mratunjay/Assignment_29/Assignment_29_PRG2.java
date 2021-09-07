package mratunjay.Assignment_29;

public class Assignment_29_PRG2 {

	boolean isPallindrome(String input) {
		int j = input.length() - 1;
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {

			if (input.charAt(index) != input.charAt(j)) {
				flag = false;
				break;
			}

			j--;

		}
		return flag;
	}

	void displayPallindromeResult(String input) {

		if (isPallindrome(input))

			System.out.println(input + " is pallindrome");
		else
			System.out.println(input + " is not a pallindrome");
	}

	public static void main(String[] str) {
		String input = "malayalam";
		Assignment_29_PRG2 A_29 = new Assignment_29_PRG2();
		A_29.displayPallindromeResult(input);
	}
}
