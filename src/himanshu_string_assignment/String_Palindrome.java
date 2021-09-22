package himanshu_string_assignment;

public class String_Palindrome {

	int count = 0;
	boolean flag;

	boolean isPalindrome(String str) {
		String input = str;
		String output = "";

		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);

		}
		if (input.equals(output)) {
			flag = true;
		} else
			flag = false;

		return flag;
	}

	void displayResult(String str) {
		if (isPalindrome(str) == false)
			System.out.println(str + " is not Palindrome");
		else if (flag = true) {
			System.out.println(str + " is palindrome");
		}
	}

	public static void main(String[] args) {
		String_Palindrome assignment29_1 = new String_Palindrome();
		assignment29_1.displayResult("naman");
		assignment29_1.displayResult("aabbaa");
		assignment29_1.displayResult("Nitin"); // N is capital
		assignment29_1.displayResult("himanshu");

	}
}
