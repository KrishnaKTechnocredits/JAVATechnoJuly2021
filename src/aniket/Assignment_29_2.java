package aniket;

public class Assignment_29_2 {
	boolean isPalindrome(String input) {
		// boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == input.charAt(input.length() - 1)) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String input = "nitin";
		Assignment_29_2 assignment_29_2 = new Assignment_29_2();
		boolean flag = assignment_29_2.isPalindrome(input);
		if (flag)
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " not a palindrome");
	}
}
