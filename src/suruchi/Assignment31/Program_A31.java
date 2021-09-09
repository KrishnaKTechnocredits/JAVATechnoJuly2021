package suruchi.Assignment31;

import java.util.Arrays;
import java.util.Scanner;

public class Program_A31 {

	void getTripletSequenceCount(int[] arr) {
		int sequenceCount = 0;
		for (int index = 1; index < arr.length - 1; index++) {
			if (arr[index - 1] == (arr[index] - 1) && arr[index + 1] == (arr[index] + 1))
				sequenceCount++;
		}
		if (sequenceCount > 0)
			System.out.println("Number of triplet sequences in the array is: " + sequenceCount);
		else
			System.out.println("No consecutive triplets present");
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

	void printPerfectNumbers(int startIndex, int endIndex) {
		System.out.println("Output: ");
		boolean flag = true;
		for (int input = startIndex; input <= endIndex; input++) {
			if (isPerfectNumber(input)) {
				System.out.println(input + " ");
				flag = false;
			}
		}
		if (flag)
			System.out.println("No perfect numbers in this range");
	}

	public static void main(String[] args) {
		Program_A31 program_A31 = new Program_A31();

		Scanner scanner = new Scanner(System.in);

		System.out.println("*****Check for count of triplet sequences*****");
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };

		System.out.println("Array is as displayed: " + Arrays.toString(arr));

		program_A31.getTripletSequenceCount(arr);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("*****Check for perfect numbers in given range*****");

		System.out.print("Enter a starting number:");
		int startNum = scanner.nextInt();

		System.out.print("Enter the ending number:");
		int endNum = scanner.nextInt();

		System.out.println();
		program_A31.printPerfectNumbers(startNum, endNum);

		scanner.close();
	}
}