package nasir_Assignment_29;

public class PallindromeWithoutReverse {
	void getPalindromeWithoutReverse(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == input.charAt((input.length() - 1) - index)) {
				flag = true;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("The input string: " + input + " is palindrome");
		} else {
			System.out.println("The input string: " + input + " is not palindrome");
		}

	}

	public static void main(String[] args) {
		PallindromeWithoutReverse pallindromeWithoutReverse = new PallindromeWithoutReverse();
		String input1 = "naman";
		String input2 = "NAsir";
		String input3 = "malayalam";
		pallindromeWithoutReverse.getPalindromeWithoutReverse(input1);
		pallindromeWithoutReverse.getPalindromeWithoutReverse(input2);
		pallindromeWithoutReverse.getPalindromeWithoutReverse(input3);

	}

}
