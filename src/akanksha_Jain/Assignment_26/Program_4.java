package akanksha_Jain.Assignment_26;

import java.util.Scanner;

public class Program_4 {
	
	void swapNumbers(int a, int b) {
		System.out.println("Before swap:- ");
		System.out.println("Value of a=" + a + ", Value of b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap:- ");
		System.out.println("Value of a=" + a + ", Value of b=" + b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		System.out.println("Enter second number");
		int b = scanner.nextInt();
		Program_4 program_4 = new Program_4();
		program_4.swapNumbers(a, b);
		scanner.close();
	}

}
