package madhavi;

public class Assignment_29_2 {
	boolean isPallindrome(String input) {
		int inputLength = input.length();

		while (inputLength > 0) {
			input.charAt(inputLength - 1);
			inputLength--;
		}
		return true;
	}

	void displayPallindromeResult(String input) {
		if (isPallindrome(input)) {
			System.out.println(input + " is pallindrome");
		} else {
			System.out.println(input + " is not a pallindrome");
		}
	}

	public static void main(String[] args) {
		Assignment_29_2 assignment_29_2 = new Assignment_29_2();
		System.out.println(".....Find Pallindrome by writing reverse method logic.....");
		String input = "malayalam";
		System.out.println("String= " + input.toString());
		assignment_29_2.displayPallindromeResult(input);

	}
}
