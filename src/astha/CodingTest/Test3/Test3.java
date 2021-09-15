package astha.CodingTest.Test3;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	int[] removeElementFromArray(int[] input, int target) {
		int length = input.length;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == target) {
				length = input.length - 1;
				break;
			}
		}
		int[] output = new int[length];
		for (int index = 0, index1 = 0; index < input.length; index++) {
			if (input[index] == target) {
				continue;
			}
			output[index1++] = input[index];
		}
		return output;
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		System.out.println("Enter the number of elements to be added in the array");
		Scanner scanner = new Scanner(System.in);
		int lengthOfArray = scanner.nextInt();
		int[] inputArray = new int[lengthOfArray];
		System.out.println("Enter the elements");
		for (int index = 0; index < lengthOfArray; index++) {
			inputArray[index] = scanner.nextInt();
		}
		System.out.println("Enter the target element to remove from array");
		int target = scanner.nextInt();
		System.out.println("Output Array :" +Arrays.toString(test3.removeElementFromArray(inputArray, target)));
	
		}
	}
