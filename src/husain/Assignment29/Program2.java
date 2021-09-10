package husain.Assignment29;

import java.util.Scanner;

public class Program2 {

	boolean isPalindrome(String word) {

		String str = word.toLowerCase();

		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == str.charAt(str.length() - 1 - index))
				flag = true;
			else {
				flag = false;
				break;
			}

		}

		return flag;
	}

	void display(String input) {

		if (isPalindrome(input))
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 obj = new Program2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String input = scanner.next();
		obj.display(input);

	}

}
