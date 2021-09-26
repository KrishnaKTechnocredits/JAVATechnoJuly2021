/*
 * find the triple which in sequence and having maximum sum.
 */

package bhagyashree;

import java.util.Arrays;

public class Assignment32 {

	void getTripletMaxSum(int[] array) {

		int sum = 0;
		int maxsum = 0;
		int start = 0;
		for (int index = 0; index < array.length - 2; index++) {
			if (array[index] == array[index + 1] - 1 && array[index] == array[index + 2] - 2) {
				System.out.print(array[index] + " " + array[index + 1] + " " + array[index + 2] + "\n");
				sum = array[index] + array[index + 1] + array[index + 2];
				System.out.println("Sum for triplet is:" + sum);
				if (sum > maxsum) {
					maxsum = sum;
					start = index;

				}
			}

		}
		int[] output = new int[3];
		int count = 0;
		for (int index = start; index < start + 3; index++) {
			output[count] = array[index];
			count++;
		}
		System.out.println(Arrays.toString(output) + " is a triplet having maximum sum" + " And sum is:" + maxsum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 24, 25, 26, 80, 81, 82, 64, 65, 66 };
		Assignment32 ass32 = new Assignment32();
		ass32.getTripletMaxSum(input);
	}

}
