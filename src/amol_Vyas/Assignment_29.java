package amol_Vyas;

public class Assignment_29 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	boolean checkPalindromeStringUsingReverseMethod(String input) {
		boolean flag = false;
		String output = getReverseString(input);
		if (input.equalsIgnoreCase(output)) {
			flag = true;
		} else
			flag = false;
		return flag;
	}

	boolean checkPalindromeString(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == input.charAt((input.length() - 1) - index)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	boolean checkPalindromNumber(int number) {
		boolean flag = false;
		int reminder = 0, sum = 0, temp = number;
		while (number > 0) {
			reminder = number % 10;
			sum = (sum * 10) + reminder;
			number = number / 10;
		}
		if (sum == temp)
			flag = true;
		else
			flag = false;

		return flag;

	}

	void displayPalindromeString(boolean flag) {
		if (flag)
			System.out.println("Given input is palindrome");
		else
			System.out.println("Given input is not palindrome");
	}

	public static void main(String[] args) {
		Assignment_29 assignment_29 = new Assignment_29();
		assignment_29.displayPalindromeString(assignment_29.checkPalindromeStringUsingReverseMethod("Madam"));
		assignment_29.displayPalindromeString(assignment_29.checkPalindromeStringUsingReverseMethod("Mada"));
		assignment_29.displayPalindromeString(assignment_29.checkPalindromeString("malayalam"));
		assignment_29.displayPalindromeString(assignment_29.checkPalindromeString("malayala"));
		assignment_29.displayPalindromeString(assignment_29.checkPalindromNumber(12321));
		assignment_29.displayPalindromeString(assignment_29.checkPalindromNumber(1232));
	}
}
