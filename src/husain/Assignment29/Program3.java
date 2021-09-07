package husain.Assignment29;

import java.util.Scanner;

public class Program3 {

	boolean isPalindrome(int input) {

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

	void display(int input) {

		if (isPalindrome(input))
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 obj = new Program3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = scanner.nextInt();
		obj.display(input);

	}

}
