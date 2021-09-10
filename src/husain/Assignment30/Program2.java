package husain.Assignment30;

import java.util.Scanner;

public class Program2 {

	boolean isArsmtrong(int input) {

		int sum = 0;
		int remainder = 0;
		int num = input;

		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			sum = sum + remainder * remainder * remainder;
		}

		if (sum == input)
			return true;
		else
			return false;

	}

	void display(int input) {

		if (isArsmtrong(input))
			System.out.println(input + " is an Armstrong number");
		else
			System.out.println(input + " is not an Armstrong number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 obj = new Program2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = scanner.nextInt();
		obj.display(input);

	}

}
