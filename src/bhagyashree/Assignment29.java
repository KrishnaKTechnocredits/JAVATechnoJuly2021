package bhagyashree;

public class Assignment29 {

	// to verify given string is palindrom by using reverser string
	boolean isPalindromeString(String input) {
		boolean flag = true;
		String reverse = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			reverse += ch;
		}
		if (input.equals(reverse))
			System.out.println(input + " is palindrome");
		else {
			flag = false;
			System.out.println(input + "  is not a palindrome");

		}
		return flag;
	}

	// to find string is palindrome or not without reverse string
	boolean isStringPalindrom(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == input.charAt(input.length() - 1)) {
				return true;
			} else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {

		String name = "aabbaa123";

		String name1 = "aaabbbaaa";
		Assignment29 assignment29 = new Assignment29();
		assignment29.isPalindromeString(name);

		boolean flag = assignment29.isStringPalindrom(name1);
		if (flag) {
			System.out.println(name1 + "  is Palindrome");
		} else {
			System.out.println(name1 + "  is not palindrome");
		}
	}
}
