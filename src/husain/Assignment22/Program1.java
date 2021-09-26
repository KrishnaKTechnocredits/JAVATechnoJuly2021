package husain.Assignment22;

import java.util.Scanner;

public class Program1 {

	int count = 0;

	int findDigits(String str) {

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program1 obj = new Program1();
		System.out.println("Please enter an alphanumeric string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("The number of digits in the given string is " + obj.findDigits(str));

	}

}
