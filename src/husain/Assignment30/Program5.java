package husain.Assignment30;

import java.util.Scanner;

public class Program5 {

	boolean isPerfectSquare(int input) {

		boolean flag = false;
		int num = input;
		int sum = 0;
		for (int index = 1; index < input; index++) {
			if (input / index == index && input % index == 0)
				flag = true;
		}

		return flag;
	}

	void display(int input) {

		if (isPerfectSquare(input))
			System.out.println(input + " is a perfect square");
		else
			System.out.println(input + " is not a perfect square");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program5 obj = new Program5();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = scanner.nextInt();
		obj.display(input);

	}

}
