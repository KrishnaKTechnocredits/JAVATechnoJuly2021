package madhavi;

import java.util.Arrays;

public class Coding_Test_3 {
	void removeSpecificArrayElement(int[] arr, int number) {
		int[] output = new int[arr.length - 1];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != number) {
				output[count] = arr[index];
				count++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Coding_Test_3 coding_Test_3 = new Coding_Test_3();
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int specificnumber = 14;
		coding_Test_3.removeSpecificArrayElement(input, specificnumber);

	}
}