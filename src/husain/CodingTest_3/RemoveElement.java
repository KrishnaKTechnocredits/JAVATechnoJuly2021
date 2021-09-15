package husain.CodingTest_3;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	void deleteElement(int arr[], int value) {

		int newindex = 0;

		int output[] = new int[arr.length - 1];

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != value) {
				output[newindex] = arr[index];
				newindex++;

			}

		}

		System.out.println("Array after removing the element" + Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement element = new RemoveElement();
		Scanner scanner = new Scanner(System.in);
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("Please enter the number you wish to remove from the give array: " + Arrays.toString(input));
		int value = scanner.nextInt();
		element.deleteElement(input, value);

	}

}
