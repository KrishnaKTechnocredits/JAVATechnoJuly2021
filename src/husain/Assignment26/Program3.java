package husain.Assignment26;

import java.util.Scanner;

public class Program3 {

	void swapNumbers(int num1, int num2) {
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("The swapped numbers are number1: " + num1 + " and number2: " + num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 obj = new Program3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = scanner.nextInt();
		obj.swapNumbers(num1, num2);

	}

}
