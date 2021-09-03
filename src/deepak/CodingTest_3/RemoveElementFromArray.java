package basic.CodingTest_3;

import java.util.Arrays;

public class RemoveElementFromArray {

	void arrayAfterRemoval(int[] arr, int num) {
		int[] arr1 = new int[arr.length - 1];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				arr1[cnt] = arr[i];
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		RemoveElementFromArray arr = new RemoveElementFromArray();
		int[] input = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		arr.arrayAfterRemoval(input, 14);

	}

}
