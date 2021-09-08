package suruchi.Assignment30;

import java.util.Scanner;

public class Program_A30 {

	int getReverseNumber(int num) {
		int remainder = 0;
		int reverseNum = 0;
		while (num > 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		return reverseNum;
	}

	boolean isPalindromeNumber(int input) {
		if (input == getReverseNumber(input))
			return true;
		return false;
	}

	boolean isArmStrongNumber(int num) {
		int armstrongNum = 0, remainder = 0, originalNum = num;
		while (num > 0) {
			remainder = num % 10;
			armstrongNum += (int) Math.pow(remainder, 3);
			num = num / 10;
		}
		if (armstrongNum == originalNum)
			return true;
		return false;
	}

	boolean isPerfectNumber(int input) {
		int output = 0;
		for (int index = 1; index < input; index++) {
			if (input % index == 0)
				output += index;
		}
		if (output == input)
			return true;
		return false;
	}

	boolean isPerfectSquare(int num) {
		int sqrtNum = (int) Math.sqrt(num);
		if (sqrtNum * sqrtNum == num)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Program_A30 program_A30 = new Program_A30();

		Scanner scanner = new Scanner(System.in);

		char ch = 'Y';

		while (ch == 'Y' || ch == 'y') {
			System.out.print("Enter a number to generate the reverse of it: ");
			int num = scanner.nextInt();

			System.out.println("Reverse of " + num + " is: " + program_A30.getReverseNumber(num));

			System.out.print("Enter a number to check if it is a palindrome: ");
			int num2 = scanner.nextInt();

			if (program_A30.isPalindromeNumber(num2))
				System.out.println(num2 + " is a palindrome");
			else
				System.out.println(num2 + " is not a palindrome");

			System.out.print("Enter a number to check if it is an Armstrong number: ");
			int num3 = scanner.nextInt();

			if (program_A30.isArmStrongNumber(num3))
				System.out.println(num3 + " is an Armstrong number");
			else
				System.out.println(num3 + " is not an Armstrong number");

			System.out.print("Enter a number to check if it is a perfect number: ");
			int num4 = scanner.nextInt();

			if (program_A30.isPerfectNumber(num4))
				System.out.println(num4 + " is a perfect number");
			else
				System.out.println(num4 + " is not a perfect number");

			System.out.print("Enter a number to check if it is a perfect square: ");
			int num5 = scanner.nextInt();

			if (program_A30.isPerfectSquare(num5))
				System.out.println(num5 + " is a perfect square");
			else
				System.out.println(num5 + " is not a perfect square");

			System.out.println("\nDo you want to perform the operations again?");
			ch = scanner.next().charAt(0);
			System.out.println();
		}
		scanner.close();
	}
}