package husain.Assignment22;

import java.util.Scanner;

public class Program2 {

	int calcSum(String str) {

		int sum = 0;

		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index)))
				sum = sum + Character.getNumericValue(str.charAt(index));
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 obj = new Program2();
		System.out.println("Please enter an alphanumeric string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("The sum of the numbers in the alphanumeric string is: " + obj.calcSum(str));
	}

}
