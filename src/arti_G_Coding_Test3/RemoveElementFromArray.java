package arti_G_Coding_Test3;

import java.util.Arrays;

/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}*/

public class RemoveElementFromArray {

	int[] removeElement(int[] input, int specificNum) {
		int index1 = 0;
		int[] output = new int[input.length - 1];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != specificNum) {
				output[index1] = input[index];
				index1++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		RemoveElementFromArray removeElementFromArray = new RemoveElementFromArray();
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("Output is " + Arrays.toString(removeElementFromArray.removeElement(input, 14)));
	}

}
