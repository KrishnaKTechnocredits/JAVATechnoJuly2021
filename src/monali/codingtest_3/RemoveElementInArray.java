package monali.codingtest_3;

import java.util.Arrays;

/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
*/

public class RemoveElementInArray {

	void removeElementInArray(int[] arr, int removeElementindex) {

		int[] output = new int[arr.length - 1];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (removeElementindex == index) {
				continue;
			} else
				output[count++] = arr[index];

		}

		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}

	}

	public static void main(String[] args) {
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int removeElementindex = 1;
		RemoveElementInArray removeElement = new RemoveElementInArray();
		removeElement.removeElementInArray(input, removeElementindex);

	}
}
