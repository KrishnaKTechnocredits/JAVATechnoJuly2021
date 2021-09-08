package devendra_Assignment_28;

import java.util.Scanner;

public class Assignment28_PalindromeStringInt {

	boolean isPalindrome(String str1) {
		String str = "";
		boolean flag = false;
		for (int index = 0; index < str1.length(); index++)
			str = str + str1.toLowerCase().charAt(str1.length() - 1 - index);
		if (str1.equals(str))
			flag = true;
		return flag;
	}
	
	boolean isPalindrome2(int input) {
		int remainder = 0;
		int num = input;
		while (num > 0) {
			remainder = remainder * 10 + num % 10;
			num = num / 10;
		}
		if (remainder == input)
			return true;
		else
			return false;
	}

	void display(String input) {
		if (isPalindrome(input))
			System.out.println(input + " is a Palindrome");
		else
			System.out.println(input + " is not a Palindrome");
	}
	
	void display(int input1) {
		if (isPalindrome2(input1))
			System.out.println(input1 + " is a Palindrome");
		else
			System.out.println(input1 + " is not a Palindrome");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment28_PalindromeStringInt obj = new Assignment28_PalindromeStringInt();
		System.out.print("String Input : ");
		String input = scanner.next();
		obj.display(input);
	
		System.out.print("Integer Input : ");
		int input1 = scanner.nextInt();
		obj.display(input1);
	}
}