package husain.Assignment29;

import java.util.Scanner;

public class Program1 {

	boolean isPalindrome(String word) {

		String str = "";

		boolean flag = false;
		for (int index = 0; index < word.length(); index++)
			str = str + word.toLowerCase().charAt(word.length() - 1 - index);
		if (word.equals(str))
			flag = true;

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
		Program1 obj = new Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String input = scanner.next();
		obj.display(input);

	}

}
