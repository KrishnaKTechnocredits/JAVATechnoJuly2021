package riten;

import java.util.Scanner;

public class Riten_CodingTest_3 {

	void findSpecificElement(int[] input, int num) {
		System.out.println("Number after removing specific element is:");
		for (int index = 0; index < input.length; index++) {
			if (num == input[index]) {
				continue;
			}

			System.out.print(input[index] + " ");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter Specific Emelemt:");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		Riten_CodingTest_3 test3 = new Riten_CodingTest_3();
		int[] element = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		test3.findSpecificElement(element, num);

	}

}
