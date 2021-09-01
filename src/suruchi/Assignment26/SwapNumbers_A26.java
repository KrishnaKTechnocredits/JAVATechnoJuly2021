package suruchi.Assignment26;

import java.util.Scanner;

public class SwapNumbers_A26 {

	void swapNumbersWith3rdVariable(int x, int y) {
		int temp = 0;

		System.out.println("Swapping of Variables using 3rd variable: ");
		System.out.println("Values of both variables: " + x + ", " + y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("Values of both variables after swapping: " + x + ", " + y);
	}

	void swapNumbersWO3rdVariable(int x, int y) {
		System.out.println("Swapping of Variables without using 3rd variable: ");
		System.out.println("Values of both variables: " + x + ", " + y);
		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("Values of both variables after swapping: " + x + ", " + y);
	}

	public static void main(String[] args) {
		SwapNumbers_A26 swapNumbers_A26 = new SwapNumbers_A26();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number to be stored in element X:");
		int num1 = scanner.nextInt();
		// 10
		System.out.println("Enter a number to be stored in element Y:");
		int num2 = scanner.nextInt();
		// 20

		System.out.println();
		swapNumbers_A26.swapNumbersWith3rdVariable(num1, num2);

		System.out.println();
		swapNumbers_A26.swapNumbersWO3rdVariable(num1, num2);

		scanner.close();
	}
}