/*WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}*/

package shraddha.CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		int inputArray[] = { 25, 14, 56, 15, 36, 86, 77, 18, 29, 49 };
		RemoveElementFromArray newObject = new RemoveElementFromArray();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------------------------------------");
			System.out.println("Given array is :- " + Arrays.toString(inputArray));
			System.out.println("Enter element to be removed :- ");
			int elementToBeRemoved = sc.nextInt();
			inputArray = newObject.removeElementFromArray(inputArray, elementToBeRemoved);
			System.out.println("Output array is :- " + Arrays.toString(inputArray));
			System.out.println("---------------------------------------------------");
		} while (inputArray.length > 0);
	}

	int[] removeElementFromArray(int[] inputArray, int element) {
		int count = 0;
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] == element) {
				for (int temp = index; temp < inputArray.length - 1; temp++) {
					inputArray[temp] = inputArray[temp + 1];
				}
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Element not found !!");
			return inputArray;
		} else {
			System.out.println("Element deleted successfully from the array !!");
			int[] outputArray = new int[inputArray.length - 1];
			for (int index = 0; index < outputArray.length; index++) {
				outputArray[index] = inputArray[index];
			}
			return outputArray;
		}
	}
}
