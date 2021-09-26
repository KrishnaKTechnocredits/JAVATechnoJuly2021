package husain.Assignment30;

import java.util.Scanner;

public class Program1 {

	int reverseNum(int input) {

		int remainder = 0;
		int num = input;

		while (num > 0) {

			remainder = remainder * 10 + num % 10;
			num = num / 10;
		}

		return remainder;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 obj = new Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = scanner.nextInt();
		System.out.println("The reversed number is " + obj.reverseNum(input));

	}

}
